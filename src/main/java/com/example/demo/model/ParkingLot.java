package com.example.demo.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@AllArgsConstructor
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    boolean isFree;

    public ParkingLot(boolean isFree) {
        this.isFree = isFree;
    }

    public ParkingLot() {
    }
}