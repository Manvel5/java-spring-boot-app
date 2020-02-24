package com.workfront.demo.controllers;

import com.workfront.demo.models.User;
import com.workfront.demo.services.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello/{id}")
    public User home(@PathVariable Long id) {
        User user = this.userService.getUser(id);
        return user;
    }
}
