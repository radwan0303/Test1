package com.example.demo.reservation;

import com.example.demo.car.CarModel;
import com.example.demo.member.MemberModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class ReservationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String day;
    private LocalDate rentalDate;


   /* @ManyToOne
    private MemberModel memberModel;*/

    @ManyToOne
    private CarModel carModel;

    @ManyToOne
    @JoinColumn(name = "MemberModel_id_fk",referencedColumnName = "id")
    private MemberModel memberModel;

    public ReservationModel(LocalDate rentalDate, String day) {
        this.rentalDate = rentalDate;
        this.day = day;
    }
}
