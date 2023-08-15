package com.afternoondreamer.susudo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SudokuSolvrApplication {

  public static void main(String[] args) {
    SpringApplication.run(SudokuSolvrApplication.class, args);
  }
}
