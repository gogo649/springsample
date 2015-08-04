/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 *
 * @author twitchgg
 */
@Component
public class DomaTransactionFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        DomaTransactionManager transactionManager = BeanLoader.getBean("domaTransactionManager");
        LocalTransaction tx = transactionManager.getLocalTransaction();

        try {
            tx.begin();
            filterChain.doFilter(request, response);
            tx.commit();
        } finally {
            tx.rollback();
        }
    }
}
