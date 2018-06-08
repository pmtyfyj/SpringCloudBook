package com.feng.trace1.pojo;

import java.io.Serializable;

/**
 * 用户实体类
 * @author: PMTY
 * @create: 2018-05-02 15:36
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 2902743619267036372L;
    private Long id;
    private String userName;
    private String password;
    private String address;

    public User() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}