package com.example.filmssergoandalex.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/secure")
@AllArgsConstructor
public class SecureController {

    //private final UsersService usersService;

    @GetMapping("/get-hello")
    public String getHello() {
        return "Добро пожаловать секьюрити пользователь";
    }

    //@GetMapping("/get-user")
    //public UserResponseDto getUser(Principal principal) throws Exception {
        //return usersService.getUserByUsername(principal.getName());
    //}
}


