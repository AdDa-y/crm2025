package com.powernode.springboot.bean;

import java.lang.ref.PhantomReference;

/**
 * ClassName:User
 * Description:
 * Author:dwj@
 * Datetime:2025/8/314:12
 * version:1.0
 */
public class User {
    private String username;
    private  String password;

    public String getPassword() {
        return password;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
