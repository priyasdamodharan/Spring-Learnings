package com.example.APIPractice1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class Resources {

    @Autowired
    Map<String, Movie> movies;

    @PostMapping("/v1/movie")
    void createMovie(@RequestBody MovieRequest movieRequest) throws Exception{
        if(movies.containsKey(movieRequest.getName())){
            throw new Exception("movie is present");
        }
        Movie movie = Movie.builder()
                .genre(movieRequest.getGenre())
                .language(movieRequest.getLanguage())
                .name(movieRequest.getName())
                .build();

        movies.put(movie.getName(), movie);
    }

    @GetMapping("/v1/movie")
    Movie getMovie(@RequestParam("name") String name) {
        return movies.get(name);
    }

    @PutMapping("/v1/movie/{name}")
    void updateMovie(@PathVariable("name") String name,
                     @RequestBody MovieRequest movieRequest) {
        Movie movie = movies.get(name);
        movie.setGenre(movieRequest.getGenre());
    }

    @DeleteMapping("/v1/movie/{name}")
    void deleteMovie(@PathVariable("name") String name,
                     @RequestBody MovieRequest movieRequest ) throws Exception {
        if(!movies.containsKey(name)) {
            throw new Exception("movie is not present");
        }
        movies.remove(name);
    }

}
