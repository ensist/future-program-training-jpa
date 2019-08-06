package com.gdn.future.program.training.jpa;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MainApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(MainApplication.class).run(args);
  }
}
