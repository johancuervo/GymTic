package com.gymtic.gymsedesms.controllers;
import com.gymtic.gymsedesms.exceptions.ReservationNotFoundException;
import com.gymtic.gymsedesms.models.Reservation;
import com.gymtic.gymsedesms.repositories.CampusRepository;
import com.gymtic.gymsedesms.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.*;
import com.gymtic.gymsedesms.models.Campus;

@RestController
public class ReservationController {
    private final CampusRepository campusRepository;
    private final ReservationRepository reservationRepository;
    public ReservationController(ReservationRepository reservationRepository,
                                 CampusRepository campusRepository){
        this.campusRepository=campusRepository;
        this.reservationRepository=reservationRepository;

    }
    @GetMapping("/reservations/{username}")
    Reservation getReservation(@PathVariable String username){
        return reservationRepository.findById(username)
                .orElseThrow(()->new ReservationNotFoundException("no se encontro una " +
                "reservacion con el nombre:"+username));
    }
    @PostMapping("/reservations")
    Reservation newReservation(@RequestBody Reservation reservation){
        Campus campusReserve= campusRepository.findById(reservation.getUsername()).
                orElse(null);
        if(campusReserve==null)
            throw new ReservationNotFoundException("no se encontranron reservas a nombre de"
                    +reservation.getUsername());
        return reservationRepository.save(reservation);
    }
}
