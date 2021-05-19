package com.example.hibernaterestAPI.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MovieResponse {
    private String name;
    private String genre;
    private String language;
}