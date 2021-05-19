package com.example.hibernaterestAPI.service;

import com.example.hibernaterestAPI.NotFoundException;
import com.example.hibernaterestAPI.entity.Movie;
import com.example.hibernaterestAPI.model.MovieRequest;
import com.example.hibernaterestAPI.model.MovieResponse;
import com.example.hibernaterestAPI.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    MovieRepository movieRepository;

    @Override
    public void create(MovieRequest movieRequest) {
        Movie movie = Movie.builder()
                .movieName(movieRequest.getName())
                .genre(movieRequest.getGenre())
                .language(movieRequest.getLanguage())
                .build();

        movieRepository.save(movie);
    }

    @Override
    public MovieResponse get(String name) throws NotFoundException {
        Movie movie = movieRepository.findByMovieName(name)
                .orElseThrow(()->new NotFoundException("movie name is not found"));
        return MovieResponse.builder()
                .genre(movie.getGenre())
                .name(movie.getMovieName())
                .language(movie.getLanguage())
                .build();
    }

    @Override
    public void update(String name, MovieRequest movieRequest) throws NotFoundException {
        Movie movie = movieRepository.findByMovieName(name)
                .orElseThrow(()->new NotFoundException("movie name is not found"));
        if(movieRequest.getGenre() != null)
            movie.setGenre(movieRequest.getGenre());
        if(movieRequest.getLanguage() !=null)
            movie.setLanguage(movieRequest.getLanguage());
        movieRepository.save(movie);

    }

    @Override
    public void delete(String name) throws NotFoundException {
        Movie movie = movieRepository.findByMovieName(name)
                .orElseThrow(() -> new NotFoundException("movie name not found"));
        if (movie != null) {
            movieRepository.delete(movie);

        }
    }
}
