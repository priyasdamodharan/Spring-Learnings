package com.example.hibernaterestAPI.service;

import com.example.hibernaterestAPI.NotFoundException;
import com.example.hibernaterestAPI.model.MovieRequest;
import com.example.hibernaterestAPI.model.MovieResponse;

public interface MovieService {

    void create(MovieRequest movieRequest);
    MovieResponse get(String name) throws NotFoundException;
    void update(String name, MovieRequest movieRequest) throws NotFoundException;
    void delete(String name) throws NotFoundException;

}
