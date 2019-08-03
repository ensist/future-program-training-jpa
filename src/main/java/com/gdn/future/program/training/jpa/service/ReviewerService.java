package com.gdn.future.program.training.jpa.service;

import com.gdn.future.program.training.jpa.model.entity.Reviewer;
import com.gdn.future.program.training.jpa.repository.ReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewerService {

  @Autowired
  private ReviewerRepository reviewerRepository;

  public Reviewer findByReviewerId(String reviewerId) {
    return reviewerRepository.findFirstByReviewerId(reviewerId);
  }

  public Reviewer save(Reviewer reviewer) {
    return reviewerRepository.save(reviewer);
  }

  public long deleteByReviewerId(String reviewerId) {
    return reviewerRepository.deleteByReviewerId(reviewerId);
  }
}
