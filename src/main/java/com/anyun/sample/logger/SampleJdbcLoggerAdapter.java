/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.logger;

import java.sql.SQLException;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.Sql;
import org.seasar.doma.jdbc.SqlExecutionSkipCause;

/**
 *
 * @author twitchgg
 */
public class SampleJdbcLoggerAdapter implements JdbcLogger {

    @Override
    public void logDaoMethodEntering(String string, String string1, Object... os) {
    }

    @Override
    public void logDaoMethodExiting(String string, String string1, Object o) {
    }

    @Override
    public void logDaoMethodThrowing(String string, String string1, RuntimeException re) {
    }

    @Override
    public void logSqlExecutionSkipping(String string, String string1, SqlExecutionSkipCause sesc) {
    }

    @Override
    public void logSql(String string, String string1, Sql<?> sql) {
    }

    @Override
    public void logTransactionBegun(String string, String string1, String string2) {
    }

    @Override
    public void logTransactionEnded(String string, String string1, String string2) {
    }

    @Override
    public void logTransactionCommitted(String string, String string1, String string2) {
    }

    @Override
    public void logTransactionSavepointCreated(String string, String string1, String string2, String string3) {
    }

    @Override
    public void logTransactionRolledback(String string, String string1, String string2) {
    }

    @Override
    public void logTransactionSavepointRolledback(String string, String string1, String string2, String string3) {
    }

    @Override
    public void logTransactionRollbackFailure(String string, String string1, String string2, SQLException sqle) {
    }

    @Override
    public void logAutoCommitEnablingFailure(String string, String string1, SQLException sqle) {
    }

    @Override
    public void logTransactionIsolationSettingFailuer(String string, String string1, int i, SQLException sqle) {
    }

    @Override
    public void logConnectionClosingFailure(String string, String string1, SQLException sqle) {
    }

    @Override
    public void logStatementClosingFailure(String string, String string1, SQLException sqle) {
    }

    @Override
    public void logResultSetClosingFailure(String string, String string1, SQLException sqle) {
    }

}
