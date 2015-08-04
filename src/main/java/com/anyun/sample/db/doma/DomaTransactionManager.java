/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author twitchgg
 */
public class DomaTransactionManager {

    @Autowired
    protected Config config;

    @Autowired
    protected LocalTransactionDataSource dataSource;

    public LocalTransaction getLocalTransaction() {
        return dataSource.getLocalTransaction(config.getJdbcLogger());
    }
}
