package com.example.RestTask.controller;


import com.example.RestTask.model.Authorities;
import com.example.RestTask.model.User;
import com.example.RestTask.service.AuthorizationService;
import jakarta.validation.Valid;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



import java.io.IOException;
import java.util.List;


@RestController
public class AuthorizationController {

    AuthorizationService service;

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        service = new AuthorizationService();
        return service.getAuthorities(user);
    }
    @GetMapping("/signin")
    public ResponseEntity<Resource> getForm() throws IOException {
        Resource resource = new ClassPathResource("templates/Sign.html");
        return ResponseEntity.ok()
                .contentType(MediaType.TEXT_HTML)
                .body(resource);

    }
}