package com.gdn.future.program.training.jpa.controller;

import com.gdn.future.program.training.jpa.model.constants.ApiPath;
import com.gdn.future.program.training.jpa.model.entity.Reviewer;
import com.gdn.future.program.training.jpa.service.ReviewerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class ReviewerController {

  @Autowired
  private ReviewerService reviewerService;

  @GetMapping(ApiPath.REVIEWER_BY_MOVIE_ID)
  public Reviewer findByReviewerId(@PathVariable String reviewerId) {
    return reviewerService.findByReviewerId(reviewerId);
  }

  @PostMapping(ApiPath.REVIEWER)
  public Reviewer save(@RequestBody Reviewer reviewer) {
    return reviewerService.save(reviewer);
  }

  @DeleteMapping(ApiPath.REVIEWER_BY_MOVIE_ID)
  public boolean deleteByReviewerId(@PathVariable String reviewerId) {
    return reviewerService.deleteByReviewerId(reviewerId) > 0;
  }
}
