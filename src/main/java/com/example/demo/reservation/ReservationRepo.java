package com.example.demo.reservation;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<ReservationModel, Long> {
}
