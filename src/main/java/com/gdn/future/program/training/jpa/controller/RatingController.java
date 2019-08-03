package com.gdn.future.program.training.jpa.controller;

import com.gdn.future.program.training.jpa.model.constants.ApiPath;
import com.gdn.future.program.training.jpa.model.entity.Rating;
import com.gdn.future.program.training.jpa.service.RatingService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class RatingController {

  @Autowired
  private RatingService ratingService;

  @GetMapping(ApiPath.RATING_BY_REVIEWER_ID_AND_MOVIE_ID)
  public Rating findFirstByReviewerIdAndMovieId(@PathVariable String reviewerId, String movieId) {
    return ratingService.findFirstByReviewerIdAndMovieId(reviewerId, movieId);
  }

  @PostMapping(ApiPath.RATING)
  public Rating save(@RequestBody Rating rating) {
    return ratingService.save(rating);
  }

  @DeleteMapping(ApiPath.RATING_BY_REVIEWER_ID_AND_MOVIE_ID)
  public boolean deleteByReviewerIdAndMovieId(@PathVariable String reviewerId, String movieId) {
    return ratingService.deleteByReviewerIdAndMovieId(reviewerId, movieId) > 0;
  }
}
