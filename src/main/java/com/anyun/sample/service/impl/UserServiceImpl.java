/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.service.impl;

import com.anyun.sample.db.doma.dao.UserDao;
import com.anyun.sample.db.doma.entity.UserEntity;
import com.anyun.sample.service.UserService;
import com.anyun.sample.util.StringUtils;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author twitchgg
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserEntity> getUsers() {
        return userDao.selectAll();
    }

    @Override
    public void addUser(String name) throws Exception {
        String id = StringUtils.uuidGen();
        UserEntity user = new UserEntity();
        user.setId(id);
        user.setName(name);
        userDao.insert(user);
    }
}
