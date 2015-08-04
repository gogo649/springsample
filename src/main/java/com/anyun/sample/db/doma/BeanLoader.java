/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma;

import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author twitchgg
 */
@Configuration
public class BeanLoader implements ApplicationContextAware {
    
    private static ApplicationContext applicationContext;

    public BeanLoader() {
    }

    @SuppressWarnings("unchecked")
    public static <T> T getBean(final String beanId) {
        assertContext();

        return (T) applicationContext.getBean(beanId);
    }

    public static <T> T getBean(final Class<T> clazz) {
        assertContext();

        return (T) applicationContext.getBean(clazz);
    }

    public static <T> Map<String, T> getBeansOfType(final Class<T> clazz) {
        assertContext();

        return applicationContext.getBeansOfType(clazz);
    }

    private static void assertContext() {
        if (applicationContext == null) {
            throw new UnsupportedOperationException("Set this class as bean to your @Configuration class.");
        }
    }

    @Override
    public void setApplicationContext(final ApplicationContext applicationContext) {
        BeanLoader.applicationContext = applicationContext;
    }

}
