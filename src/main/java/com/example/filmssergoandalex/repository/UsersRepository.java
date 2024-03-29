package com.example.filmssergoandalex.repository;

import com.example.filmssergoandalex.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User,Integer> {
    Optional<User> findByUsername(String username);
}
