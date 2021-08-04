package com.example.demo.study.tuling.day1;

import java.io.Serializable;

/**
 * @author liusongshan
 * @version 1.0.0
 * @createTime 2021/8/2 13:55
 */
public class User implements Serializable {
    private static final long serialVersionUID = 6997112764760097402L;

    byte[] bytes = new byte[1024 * 1024];
    private String name;
    private String password;
    private String address;
    private transient String nikeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }
}
