package com.datsistemas.helpdesk.resources.exceptions;

import com.datsistemas.helpdesk.services.exception.ObjectnotFoundExceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
    @ExceptionHandler(ObjectnotFoundExceptions.class)
    public ResponseEntity<StandardError> objectnotFoundExceptions(ObjectnotFoundExceptions ex, HttpServletRequest request){
    StandardError error = new StandardError(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(),"Object not found",ex.getMessage(),request.getRequestURI());
    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
