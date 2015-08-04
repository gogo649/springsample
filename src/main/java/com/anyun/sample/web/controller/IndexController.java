/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.web.controller;

import com.anyun.sample.db.doma.entity.UserEntity;
import com.anyun.sample.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author twitchgg
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index")
    public String index(Model model) {
        List<UserEntity> users = userService.getUsers();
        for (UserEntity user : users) {
            System.out.println("-----user:" + user.asJson());
        }
        return "index";
    }

    @RequestMapping("/adduser")
    public String addUser(@RequestParam(value = "name", required = true) String name, Model model) throws Exception {
        userService.addUser(name);
        return "index";
    }
}
