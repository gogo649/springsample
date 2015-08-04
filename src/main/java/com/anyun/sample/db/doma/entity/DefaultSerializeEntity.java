/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma.entity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 *
 * @author twitchgg
 */
public abstract class DefaultSerializeEntity implements DatabaseEntity {

    @Override
    public final String asJson() {
        GsonBuilder gb = new GsonBuilder();
        gb.disableHtmlEscaping();
        Gson gson = gb.create();
        return gson.toJson(this);
    }
}
