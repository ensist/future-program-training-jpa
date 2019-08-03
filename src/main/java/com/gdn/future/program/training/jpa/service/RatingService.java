package com.gdn.future.program.training.jpa.service;

import com.gdn.future.program.training.jpa.model.entity.Movie;
import com.gdn.future.program.training.jpa.model.entity.Rating;
import com.gdn.future.program.training.jpa.model.entity.Reviewer;
import com.gdn.future.program.training.jpa.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class RatingService {

  @Autowired
  private MovieService movieService;

  @Autowired
  private ReviewerService reviewerService;

  @Autowired
  private RatingRepository ratingRepository;

  public Rating findFirstByReviewerIdAndMovieId(String reviewerId, String movieId) {
    return ratingRepository.findFirstByReviewerIdAndMovieId(reviewerId, movieId);
  }

  public Rating save(Rating rating) {
    Reviewer reviewer = reviewerService.findByReviewerId(rating.getReviewerId());
    Movie movie = movieService.findByMovieId(rating.getMovieId());
    rating.setMovie(movie);
    rating.setReviewer(reviewer);
    return ratingRepository.save(rating);
  }

  public Rating saveWithCascade(Rating rating) throws Exception {
    Reviewer reviewer = reviewerService.findByReviewerId(rating.getReviewerId());
    Movie movie = movieService.findByMovieId(rating.getMovieId());
    rating.setMovie(movie);
    rating.setReviewer(reviewer);
    movie.setRatings(new HashSet<>(Arrays.asList(rating)));
    movieService.save(movie);
    return rating;
  }

  public long deleteByReviewerIdAndMovieId(String reviewerId, String movieId) {
    return ratingRepository.deleteByReviewerIdAndMovieId(reviewerId, movieId);
  }
}
