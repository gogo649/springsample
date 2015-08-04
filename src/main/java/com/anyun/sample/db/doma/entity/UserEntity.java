/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anyun.sample.db.doma.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 *
 * @author twitchgg
 */
@Entity
@Table(name = "USER_INFO_BASE")
public class UserEntity extends DefaultSerializeEntity {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "USER_NAME")
    @NotNull
    @Size(min = 4, max = 16)
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
