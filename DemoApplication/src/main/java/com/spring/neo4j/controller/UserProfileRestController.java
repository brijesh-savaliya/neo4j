package com.spring.neo4j.controller;

import com.spring.neo4j.entity.User;
import com.spring.neo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserProfileRestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/create")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User cretaed successfully";
    }

    @RequestMapping("/delete")
    public String deleteAll() {
        userRepository.deleteAll();
        return "User deleted successfully";
    }
}