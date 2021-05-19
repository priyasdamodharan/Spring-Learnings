package com.example.hibernaterestAPI.repository;


import com.example.hibernaterestAPI.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Long> {
    Optional<Movie> findByMovieName(String name);
    Optional<Movie> findByGenre(String genre);
}

