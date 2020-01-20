package onem.dsj.generator.sys.service.impl;

import onem.dsj.generator.sys.dao.EntityTableInfo;
import onem.dsj.generator.sys.service.GeneratorService;
import onem.dsj.generator.sys.service.SQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dengshaojie
 * @date 2020/1/17 18:41
 */
@Service
public class GeneratorServiceImpl implements GeneratorService {

    private final SQLService sqlService;

    @Autowired
    public GeneratorServiceImpl(SQLService sqlService) {
        this.sqlService = sqlService;
    }

    @Override
    public boolean createTable(EntityTableInfo info) {
        sqlService.createTable(info);
        return true;
    }

    @Override
    public boolean createSeq(String name) {
        sqlService.createSeq(name);
        return true;
    }
}
