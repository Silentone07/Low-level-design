package com.example.practice.bookmyshow;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository  extends JpaRepository<Movie,Integer> {

    List<Movie> getAllMovie();
    public Movie getMovieById(int ind);
}
