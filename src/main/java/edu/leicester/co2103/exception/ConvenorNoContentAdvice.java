package edu.leicester.co2103.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import edu.leicester.co2103.controller.info.ErrorInfo;

@ControllerAdvice
public class ConvenorNoContentAdvice {

    @ResponseBody
    @ExceptionHandler(ConvenorNoContentException.class)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    ErrorInfo ConvenorNoContentHandler(ConvenorNoContentException ex) {
        return new ErrorInfo(ex.getMessage());
    }

}