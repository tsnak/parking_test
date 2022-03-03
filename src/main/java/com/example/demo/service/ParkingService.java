package com.example.demo.service;

import com.example.demo.repository.ParkingLotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService {

    private final ParkingLotRepository parkingLotRepository;

    public ParkingService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    public long getFreeLotsCount() {
        return parkingLotRepository.getFreeParkingLotsCount();
    }

    public List<Long> getFreeLots() {
        return parkingLotRepository.getFreeParkingLots();
    }
}
