package com.restfull.application.rest_full_application.controllers;

import com.restfull.application.rest_full_application.models.User;
import com.restfull.application.rest_full_application.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }


    @PostMapping(value = "/load")
    public void load(@RequestBody User user){
        userService.save(user);
    }

    @PostMapping(value = "/delete")
    public void delete(@RequestBody User user){
        userService.delete(user);
    }



}
