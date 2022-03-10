package com.jb.hapoalim.Task.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomerControllerAdvice {
    @ExceptionHandler(value = {Exception.class})
   public ResponseEntity<String> displayFailure(Exception e){
        return new ResponseEntity<String>("FAILURE", HttpStatus.BAD_REQUEST);
    }

}
