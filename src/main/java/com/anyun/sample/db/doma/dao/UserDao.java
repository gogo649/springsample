/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma.dao;

import com.anyun.sample.db.doma.ConfigAutowireable;
import com.anyun.sample.db.doma.entity.UserEntity;
import java.util.List;
import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;

/**
 *
 * @author twitchgg
 */
@Dao
@ConfigAutowireable
public interface UserDao {

    @Select
    List<UserEntity> selectAll();

    @Insert
    int insert(UserEntity user) throws Exception;
}
