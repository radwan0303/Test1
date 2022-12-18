package com.example.demo.member;


import com.example.demo.reservation.ReservationModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class MemberModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private Integer zip;
    private Boolean approved;
    private String ranking;

    @OneToMany(mappedBy = "memberModel",cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<ReservationModel> reservationModelList = new ArrayList<>();



    /*fjernes*/
    /*refere til address gøves ved at lave onetoone relatioonship*/
    /*address objekt refere til city det samme med city */
    public MemberModel(String firstName, String lastName, String street, String city, Integer zip, Boolean approved, String ranking) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.zip = zip;
        this.approved = approved;
        this.ranking = ranking;
    }
}
