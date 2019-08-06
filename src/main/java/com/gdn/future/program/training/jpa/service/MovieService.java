package com.gdn.future.program.training.jpa.service;

import com.gdn.future.program.training.jpa.model.entity.Movie;
import com.gdn.future.program.training.jpa.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MovieService {

  @Autowired
  private MovieRepository movieRepository;

  @Cacheable(value = "findByMovieId", key = "#movieId")
  public Movie findByMovieId(String movieId) {
    Movie movie = movieRepository.findFirstEagerlyByMovieId(movieId);
    System.out.println(movie.getRatings());
    return movie;
  }

  public Movie findByMovieIdOptimisticLocking(String movieId) {
    Movie movie = movieRepository.findFirstByMovieId(movieId);

    Movie movie2 = movieRepository.findFirstByMovieId(movieId);
    System.out.println(movie.getId());
    System.out.println(movie2.getId());
    movie2.setMovieLanguage(UUID.randomUUID().toString());
    movieRepository.save(movie2);

    movie.setMovieLanguage(UUID.randomUUID().toString());
    movieRepository.save(movie);
    return movie;
  }

  @CacheEvict(value = "findByMovieId", key = "#movieId")
  @Transactional(propagation = Propagation.REQUIRES_NEW)
  public Movie save(Movie movie) throws Exception {
    Movie savedMovie = movieRepository.save(movie);
    if (true) {
      throw new Exception("test");
    }
    return savedMovie;
  }

  public long deleteByMovieId(String movieId) {
    return movieRepository.deleteByMovieId(movieId);
  }
}
