package com.qdtg.gitpurview.pojo;

import java.util.List;

/**
 * @program: git-purview
 * @description: 用户
 * @author: JavaLitterBoy
 * @create: 2018-09-13 11:14
 **/
public class User {
    private String username;    // 用户名
    private String password;    // 用户密码
    private String email;       // 用户邮箱
    private List<String> paths; // 权限目录

    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
