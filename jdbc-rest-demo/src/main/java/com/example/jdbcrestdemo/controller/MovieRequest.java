package com.example.jdbcrestdemo.controller;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MovieRequest {
    private String name;
    private String genre;
    private String language;
}
