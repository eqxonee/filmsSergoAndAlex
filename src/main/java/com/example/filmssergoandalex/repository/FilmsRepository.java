package com.example.filmssergoandalex.repository;

import com.example.filmssergoandalex.model.FilmsItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FilmsRepository extends JpaRepository<FilmsItem, Integer> {
}
