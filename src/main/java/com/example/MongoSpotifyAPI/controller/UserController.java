package com.example.MongoSpotifyAPI.controller;

import com.example.MongoSpotifyAPI.model.User;
import com.example.MongoSpotifyAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //testing postman//
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    //user sign up functions.  Takes values of username and password with an embedded
    //user profile that requires an email input.
    //songs input will return null.
    @PostMapping("/signup")
    public User createUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }

    //200OK for user/email.  no return displayed in postman. //
    @GetMapping("/user/{email}")
    public User findUserByEmail(@PathVariable String email){
        return userService.findUserByEmail(email);
    }

    //200 OK.  returns all users in postman//
    @GetMapping("/list")
    public List<User> listUsers(){
        return userService.listUsers();
    }
}

