package com.example.userservice.exception;

import com.example.userservice.payload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AllException {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ApiResponse> handleUserNotFoundException(UserNotFoundException e){

        String msg= e.getMessage();
        ApiResponse response=ApiResponse.builder().message(msg).status(HttpStatus.NOT_FOUND).build();

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

    }
}
