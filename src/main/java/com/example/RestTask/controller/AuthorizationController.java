package com.example.RestTask.controller;


import com.example.RestTask.model.Authorities;
import com.example.RestTask.model.User;
import com.example.RestTask.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AuthorizationController {

    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        service = new AuthorizationService();
        return service.getAuthorities(user);
    }
}