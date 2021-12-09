package com.gymtic.gymsedesms.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class ReservationFullAdvice {
    @ResponseBody
    @ExceptionHandler(ReservationFullException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String ReservationFullAdvice(ReservationFullException ex){
        return ex.getMessage();
    }

}
