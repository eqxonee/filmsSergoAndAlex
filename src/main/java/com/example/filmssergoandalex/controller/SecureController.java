package com.example.filmssergoandalex.controller;


import com.example.filmssergoandalex.dtos.UserResponseDto;
import com.example.filmssergoandalex.model.FilmsItem;
import com.example.filmssergoandalex.service.FilmsService;
import com.example.filmssergoandalex.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/secure")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class SecureController {

    private final UsersService usersService;
    private final FilmsService filmsService;

    @GetMapping("/get-hello")
    public String getHello() {
        return "Добро пожаловать секьюрити пользователь";
    }

    @GetMapping("/get-user")
    public UserResponseDto getUser(Principal principal) throws Exception {
        return usersService.getUserByUsername(principal.getName());
    }

    @GetMapping(value = "/getAll")
    public List<FilmsItem> getAll() {
        return filmsService.getAll();
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        filmsService.deleteById(id);
    }

    @PostMapping(value = "/addNew")
    public void addNew(@RequestBody FilmsItem filmsItem) {
        filmsService.addNew(filmsItem);
    }

}


