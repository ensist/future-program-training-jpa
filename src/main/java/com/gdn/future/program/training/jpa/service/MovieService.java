package com.gdn.future.program.training.jpa.service;

import com.gdn.future.program.training.jpa.model.entity.Movie;
import com.gdn.future.program.training.jpa.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

  @Autowired
  private MovieRepository movieRepository;

  public Movie findByMovieId(String movieId) {
    return movieRepository.findFirstByMovieId(movieId);
  }

  public Movie save(Movie movie) {
    return movieRepository.save(movie);
  }
}
