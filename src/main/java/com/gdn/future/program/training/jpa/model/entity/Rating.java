package com.gdn.future.program.training.jpa.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gdn.future.program.training.jpa.model.constants.RatingConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = RatingConstant.TABLE_NAME)
public class Rating extends BaseEntity {

  @Column(name = RatingConstant.REVIEWER_ID)
  private String reviewerId;

  @Column(name = RatingConstant.MOVIE_ID)
  private String movieId;

  @Column(name = RatingConstant.REVIEWER_STARS)
  private int reviewerStars;

  @Column(name = RatingConstant.NUMBER_OF_RATINGS)
  private int numberOfRatings;

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = RatingConstant.MOVIE_FK)
  private Movie movie;

  @JsonIgnore
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = RatingConstant.REVIEWER_FK)
  private Reviewer reviewer;

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Reviewer getReviewer() {
    return reviewer;
  }

  public void setReviewer(Reviewer reviewer) {
    this.reviewer = reviewer;
  }

  public String getReviewerId() {
    return reviewerId;
  }

  public void setReviewerId(String reviewerId) {
    this.reviewerId = reviewerId;
  }

  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public int getReviewerStars() {
    return reviewerStars;
  }

  public void setReviewerStars(int reviewerStars) {
    this.reviewerStars = reviewerStars;
  }

  public int getNumberOfRatings() {
    return numberOfRatings;
  }

  public void setNumberOfRatings(int numberOfRatings) {
    this.numberOfRatings = numberOfRatings;
  }
}
