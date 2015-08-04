/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.config;

import com.anyun.sample.db.doma.DomaTransactionManager;
import javax.sql.DataSource;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.NoCacheSqlFileRepository;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;
import org.seasar.doma.jdbc.tx.LocalTransactionDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author twitchgg
 */
@Configuration
@PropertySource("classpath:datasource.properties")
@EnableTransactionManagement
public class DatabaseConfig {

    @Value("${spring.datasource.driverClassName}")
    protected String driverClassName;
    @Value("${spring.datasource.url}")
    protected String url;
    @Value("${spring.datasource.username}")
    protected String username;
    @Value("${spring.datasource.password}")
    protected String password;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return new LocalTransactionDataSource(dataSource);
    }

    @Bean
    public DomaTransactionManager domaTransactionManager() {
        return new DomaTransactionManager();
    }

    @Bean
    public Dialect dialect() {
        return new MysqlDialect();
    }

    @Bean
    public SqlFileRepository sqlFileRepository() {
        return new NoCacheSqlFileRepository();
    }

    @Bean
    public Config config() {
        return new Config() {
            @Override
            public Dialect getDialect() {
                return dialect();
            }

            @Override
            public DataSource getDataSource() {
                return dataSource();
            }

            @Override
            public SqlFileRepository getSqlFileRepository() {
                return sqlFileRepository();
            }
        };
    }
}
