package com.example.RestTask.repository;

import com.example.RestTask.exception.InvalidCredentials;
import com.example.RestTask.exception.UnauthorizedUser;
import com.example.RestTask.model.Authorities;
import com.example.RestTask.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepository {
    List<User> userAuthorities = new ArrayList();

    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = userAuthorities.stream()
                .filter(item -> item.getUser().equals(user) && item.getPassword().equals(password))
                .map(item -> item.getAuthorities()).collect(Collectors.toList());
        return authorities;
    }

}
