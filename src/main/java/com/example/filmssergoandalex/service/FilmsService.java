package com.example.filmssergoandalex.service;

import com.example.filmssergoandalex.model.FilmsItem;
import com.example.filmssergoandalex.repository.FilmsRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FilmsService {

    private final FilmsRepository filmsRepository;

    public List<FilmsItem> getAll(){
        return filmsRepository.findAll();
    }
}
