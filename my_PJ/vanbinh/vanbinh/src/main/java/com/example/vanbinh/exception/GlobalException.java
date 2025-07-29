package com.example.vanbinh.exception;

import com.example.vanbinh.error.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler
    public ResponseEntity<ErrorResponse> handleSinhVienException(SinhVienException ex) {
        com.example.vanbinh.error.ErrorResponse er=new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
    }
    @ExceptionHandler
    public ResponseEntity<com.example.vanbinh.error.ErrorResponse> handleException(Exception ex) {
        com.example.vanbinh.error.ErrorResponse er=new ErrorResponse(HttpStatus.NOT_FOUND.value(),ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
    }
}
