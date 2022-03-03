package com.example.demo.repository;

import com.example.demo.model.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ParkingLotRepository extends JpaRepository<ParkingLot, Long> {

    @Override
    <S extends ParkingLot> S save(S s);

    @Query("SELECT count(isFree) FROM ParkingLot WHERE isFree = true")
    long getFreeParkingLotsCount();

    @Query(value = "SELECT id FROM ParkingLot WHERE isFree = true")
    List<Long> getFreeParkingLots();

    @Modifying
    @Query(value = "UPDATE ParkingLot SET isFree = :isFree WHERE id = :id")
    void updateParkingLot(@Param("isFree") Boolean isFree, @Param("id") Long id);
}