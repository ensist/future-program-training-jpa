package com.gdn.future.program.training.jpa.repository;

import com.gdn.future.program.training.jpa.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MovieRepository
    extends JpaRepository<Movie, String> {

  Movie findFirstByMovieId(String movieId);

  Movie findFirstByMovieTitle(String movieTitle);

  @Query("SELECT m " +
      "FROM Movie m " +
      "LEFT JOIN FETCH m.ratings " +
      "WHERE m.movieId = ?1")
  Movie findFirstEagerlyByMovieId(String movieId);

  @Transactional
  long deleteByMovieId(String movieId);
}
