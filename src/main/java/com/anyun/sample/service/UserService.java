/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.service;

import com.anyun.sample.db.doma.entity.UserEntity;
import java.util.List;

/**
 *
 * @author twitchgg
 */
public interface UserService {

    List<UserEntity> getUsers();

    void addUser(String name) throws Exception;
}
