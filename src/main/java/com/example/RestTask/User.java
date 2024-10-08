package com.example.RestTask;

public class User {
    public String user;
    public  String password;
    public  Authorities authorities;

    public User(String user, String password, Authorities authorities) {
        this.user = user;
        this.password = password;
        this.authorities  = authorities;
    }
}
