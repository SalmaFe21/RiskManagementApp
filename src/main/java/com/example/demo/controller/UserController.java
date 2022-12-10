package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.BooleanControl;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @CrossOrigin
    @GetMapping("getAllUsers")
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    @CrossOrigin
    @PostMapping("addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("updateUser")
    public void updateUser(@RequestBody User user) {
        userService.UpdateUser(user);
    }

    @DeleteMapping("deleteUserById/{id}")
    public void deleteUser(@PathVariable long id) {
        userService.deleteUser(id);
    }


}


