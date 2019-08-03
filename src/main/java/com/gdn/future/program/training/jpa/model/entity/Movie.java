package com.gdn.future.program.training.jpa.model.entity;

import com.gdn.future.program.training.jpa.model.constants.MovieConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = MovieConstant.TABLE_NAME)
public class Movie extends BaseEntity {

  @Column(name = MovieConstant.MOVIE_ID)
  private String movieId;

  @Column(name = MovieConstant.MOVIE_TITLE)
  private String movieTitle;

  @Column(name = MovieConstant.MOVIE_YEAR)
  private int movieYear;

  @Column(name = MovieConstant.MOVIE_TIME)
  private int movieTime;

  @Column(name = MovieConstant.MOVIE_LANGUAGE)
  private String movieLanguage;

  @Column(name = MovieConstant.MOVIE_DATE_RELEASE)
  private Date movieDateRelease;

  @Column(name = MovieConstant.MOVIE_RELEASE_COUNTRY)
  private String movieReleaseCountry;

  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public int getMovieYear() {
    return movieYear;
  }

  public void setMovieYear(int movieYear) {
    this.movieYear = movieYear;
  }

  public int getMovieTime() {
    return movieTime;
  }

  public void setMovieTime(int movieTime) {
    this.movieTime = movieTime;
  }

  public String getMovieLanguage() {
    return movieLanguage;
  }

  public void setMovieLanguage(String movieLanguage) {
    this.movieLanguage = movieLanguage;
  }

  public Date getMovieDateRelease() {
    return movieDateRelease;
  }

  public void setMovieDateRelease(Date movieDateRelease) {
    this.movieDateRelease = movieDateRelease;
  }

  public String getMovieReleaseCountry() {
    return movieReleaseCountry;
  }

  public void setMovieReleaseCountry(String movieReleaseCountry) {
    this.movieReleaseCountry = movieReleaseCountry;
  }
}
