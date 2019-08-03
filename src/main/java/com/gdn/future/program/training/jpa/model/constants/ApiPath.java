package com.gdn.future.program.training.jpa.model.constants;

public class ApiPath {

  public static final String API = "/api";

  public static final String MOVIE = API + "/movie";
  public static final String MOVIE_BY_MOVIE_ID = MOVIE + "/{movieId}";

  public static final String REVIEWER = API + "/reviewer";
  public static final String REVIEWER_BY_MOVIE_ID = REVIEWER + "/{reviewerId}";
}
