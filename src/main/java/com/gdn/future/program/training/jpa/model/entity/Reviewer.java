package com.gdn.future.program.training.jpa.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gdn.future.program.training.jpa.model.constants.ReviewerConstant;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = ReviewerConstant.TABLE_NAME)
public class Reviewer extends BaseEntity {

  @Column(name = ReviewerConstant.REVIWER_ID)
  private String reviewerId;

  @Column(name = ReviewerConstant.REVIEWER_NAME)
  private String reviewerName;

  @JsonIgnore
  @OneToMany(mappedBy = "reviewer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  private Set<Rating> ratings;

  public Set<Rating> getRatings() {
    return ratings;
  }

  public void setRatings(Set<Rating> ratings) {
    this.ratings = ratings;
  }

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
