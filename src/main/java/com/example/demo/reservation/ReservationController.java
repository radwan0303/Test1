package com.example.demo.reservation;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1/reservation")
public class ReservationController {

    private final ReservationService reservationService;

    @GetMapping
    private List<ReservationModel> findAll() { return reservationService.findAll();}

    @PostMapping
    public ReservationModel save(@RequestBody ReservationModel reservationModel) { return  reservationService.save(reservationModel);}

    @DeleteMapping("/{id}")
    public ReservationModel delete(@PathVariable Long id) { return reservationService.delete(id);}

    @PatchMapping("/{id}")
    public ReservationModel update(@RequestBody ReservationModel reservationModel, @PathVariable Long id) {
        return reservationService.update(reservationModel, id);
    }

}
