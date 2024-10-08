package com.example.RestTask;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserRepository {
    public List <User> UserAuthorities = new ArrayList();
    public List<Authorities> getUserAuthorities(String user, String password){
        List<Authorities>Authorities = UserAuthorities.stream()
                .filter(item->item.user.equals(user) && item.password.equals(password))
                .map(item->item.authorities).collect(Collectors.toList());
        return Authorities;
    }
}
