package onem.dsj.generator.sys.service;

import onem.dsj.generator.sys.dao.EntityTableInfo;

/**
 * @author dengshaojie
 * @date 2020/1/20 12:26
 */

public interface SQLService {

    void createTable(EntityTableInfo info);

    void createSeq(String name);
}
