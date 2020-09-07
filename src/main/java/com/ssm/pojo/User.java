package com.ssm.pojo;

import java.io.Serializable;

//用户实体
public class User implements Serializable {
    private String account;
    private String pass;

    public User() {
    }

    public User(String account, String pass) {
        this.account = account;
        this.pass = pass;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "account='" + account + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
