package com.autoscape.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.autoscape.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
