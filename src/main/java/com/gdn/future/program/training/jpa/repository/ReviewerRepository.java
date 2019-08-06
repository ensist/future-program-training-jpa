package com.gdn.future.program.training.jpa.repository;

import com.gdn.future.program.training.jpa.model.entity.Reviewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ReviewerRepository
    extends JpaRepository<Reviewer, String> {

  Reviewer findFirstByReviewerId(String reviewerId);

  @Transactional
  long deleteByReviewerId(String reviewerId);
}
