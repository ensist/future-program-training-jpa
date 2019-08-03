package com.gdn.future.program.training.jpa.model.entity;

import com.gdn.future.program.training.jpa.model.constants.ReviewerConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = ReviewerConstant.TABLE_NAME)
public class Reviewer extends BaseEntity {

  @Column(name = ReviewerConstant.REVIWER_ID)
  private String reviewerId;

  @Column(name = ReviewerConstant.REVIEWER_NAME)
  private String reviewerName;

  public String getReviewerId() {
    return reviewerId;
  }

  public void setReviewerId(String reviewerId) {
    this.reviewerId = reviewerId;
  }

  public String getReviewerName() {
    return reviewerName;
  }

  public void setReviewerName(String reviewerName) {
    this.reviewerName = reviewerName;
  }
}
