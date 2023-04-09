package com.example.filmssergoandalex.controller;

import com.example.filmssergoandalex.model.FilmsItem;
import com.example.filmssergoandalex.service.FilmsService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/films")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor
public class FilmsController {
    private final FilmsService filmsService;

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
