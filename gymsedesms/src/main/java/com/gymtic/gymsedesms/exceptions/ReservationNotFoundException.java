package com.gymtic.gymsedesms.exceptions;

public class ReservationNotFoundException extends  RuntimeException {
    public ReservationNotFoundException(String message){
        super(message);
    }

}
