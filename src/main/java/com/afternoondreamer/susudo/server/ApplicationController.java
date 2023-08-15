package com.afternoondreamer.susudo.server;

// import com.afternoondreamer.susudo.server.models.SolveRequest;
// import com.afternoondreamer.susudo.server.models.SolveResponse;
// import com.afternoondreamer.susudo.server.ConstraintsUpdateAndOrderingSolvr;
// import com.afternoondreamer.susudo.solvr.SudokuSolvr;
// import com.afternoondreamer.susudo.server.utils.Converter;
// import com.afternoondreamer.susudo.server.utils.Validator;
// import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.server.ResponseStatusException;

@Controller
public class ApplicationController {

  @GetMapping("/sudoku")
  public String index() {
    return "index";
  }
}
