package com.gymtic.gymsedesms.models;
import org.springframework.data.annotation.Id;

import java.util.Date;

public class Reservation {
    @Id
    private String username;
    private Date registerDate;
    private  Date reservationDate;
    private Campus campus;

    public Reservation(String username, Date registerDate, Date reservationDate, Campus campus) {
        this.username = username;
        this.registerDate = registerDate;
        this.reservationDate = reservationDate;
        this.campus = campus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }
}
