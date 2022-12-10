package com.example.demo.controller;

import com.example.demo.model.User;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class SpringController {

    @GetMapping
    public ResponseEntity<User> getUser() {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

}







