package com.gdn.future.program.training.jpa.repository;

import com.gdn.future.program.training.jpa.model.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

  Rating findFirstByReviewerIdAndMovieId(String reviewerId, String movieId);

  @Transactional
  long deleteByReviewerIdAndMovieId(String reviewerId, String movieId);
}
