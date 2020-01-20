package onem.dsj.generator.sys.service;

import onem.dsj.generator.sys.dao.EntityTableInfo;

/**
 * @author dengshaojie
 * @date 2020/1/17 18:41
 */
public interface GeneratorService {

    boolean createTable(EntityTableInfo info);

    boolean createSeq(String name);
}
