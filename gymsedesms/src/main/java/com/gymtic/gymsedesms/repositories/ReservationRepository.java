package com.gymtic.gymsedesms.repositories;
import com.gymtic.gymsedesms.models.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;
public interface ReservationRepository extends MongoRepository<Reservation, String> {
    List<Reservation> findByUsername (String username);
}
