package com.example.RestTask.model;

import jakarta.validation.constraints.NotNull;

public class User {
    @NotNull
    private String user;
    @NotNull
    private String password;
    private Authorities authorities;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Authorities getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Authorities authorities) {
        this.authorities = authorities;
    }
}
