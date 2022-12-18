package com.example.demo.reservation;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepo reservationRepo;

    public List<ReservationModel> findAll() {return reservationRepo.findAll(); }

    public ReservationModel save(ReservationModel reservationModel) {return reservationRepo.save(reservationModel);}

    public ReservationModel delete(Long id) {
        reservationRepo.deleteById(id);
        return null;
    }

    public ReservationModel update(ReservationModel reservationModel, Long id){
        ReservationModel existingReservation = reservationRepo.findById(id).orElseThrow(null);
        existingReservation.setId(reservationModel.getId());
        existingReservation.setRentalDate(reservationModel.getRentalDate());
        existingReservation.setDay(reservationModel.getDay());
        return reservationRepo.save(existingReservation);
    }




}


