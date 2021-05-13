package com.example.APIPractice1.Controller;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Movie {
    private String name;
    private String genre;
    private String language;
}
