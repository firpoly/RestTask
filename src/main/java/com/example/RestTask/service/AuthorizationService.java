package com.example.RestTask.service;

import com.example.RestTask.exception.InvalidCredentials;
import com.example.RestTask.exception.UnauthorizedUser;
import com.example.RestTask.model.Authorities;
import com.example.RestTask.model.User;
import com.example.RestTask.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {
    private final UserRepository userRepository;
    public AuthorizationService (UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<Authorities> getAuthorities(User user) {
        if (isEmpty(user.getUser()) || isEmpty(user.getPassword())) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user.getUser(), user.getPassword());
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user.getUser());
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
}