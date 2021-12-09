package com.gymtic.gymsedesms.exceptions;

public class ReservationFullException extends RuntimeException {
    public ReservationFullException(String message) {
        super(message);
    }
}
