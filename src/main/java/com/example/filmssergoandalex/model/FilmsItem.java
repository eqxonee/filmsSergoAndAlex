package com.example.filmssergoandalex.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name =  "films")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FilmsItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
