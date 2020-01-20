package onem.dsj.generator.sys.service.impl;

import onem.dsj.generator.sys.dao.EntityTableInfo;
import onem.dsj.generator.sys.dao.Foreign;
import onem.dsj.generator.sys.dao.Property;
import onem.dsj.generator.sys.service.SQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author dengshaojie
 * @date 2020/1/20 12:26
 */
@Service
public class SQLServiceImpl implements SQLService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SQLServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    @Transactional
    public void createTable(EntityTableInfo info) {
        String sql = generatorCreateTableSql(info);
        if(info.isPrimaryKeyIncrement()) {
            this.createSeq("SEQ_"+info.getName().toUpperCase());
        }
        jdbcTemplate.execute(sql);
    }

    @Override
    @Transactional
    public void createSeq(String name) {
        String sqlStr = String.format("CREATE SEQUENCE %s minvalue 1 maxvalue 9999999999 start with 1 increment by 1 ", name);
        jdbcTemplate.execute(sqlStr);
    }

    @Transactional
    public String generatorCreateTableSql(EntityTableInfo info) {
        StringBuilder createSb = new StringBuilder(String.format("create table %s ( ", info.getName()));
        StringBuilder alterSb = new StringBuilder();
        StringBuilder commentSb = new StringBuilder(String.format(" comment on table %s is '%s' ", info.getName(), info.getComments()));
        for (Property p : info.getProperties()) {
            String isNotNull = p.isNotNull()?" NOT NULL ":"";
            createSb.append(String.format(" %s %s %s ", p.getName(), p.getType().getName(), isNotNull));

            commentSb.append(String.format(" comment on column %s.%s is '%s' ", info.getName(), p.getName(), p.getComments()));

            if(p.isPrimary()) {
                alterSb.append(this.generatorAlterPrimaryKeySql(p));
            }
            if(p.isForeign()) {
                alterSb.append(this.generatorAlterForeignKeySql(p));
            }
            if(p.isIncrement()) {
                this.createSeq("SEQ_"+info.getName().toUpperCase()+"_"+p.getName().toUpperCase());
            }
        }
        createSb.append(") ");
        createSb.append(alterSb);
        createSb.append(commentSb);
        return createSb.toString();
    }

    public String generatorAlterForeignKeySql(Property p) {
        Foreign f = p.getForeign();
        return String.format(" add constraint %s foreign key (%s) references %s (%s) %s ",
                f.getName(), p.getName(), f.getTableName(), f.getColumnName(), f.getCascadeDelete());
    }

    public String generatorAlterPrimaryKeySql(Property p) {
        return String.format(" add constraint primaryKey primary key (%s) ", p.getName());
    }

}
