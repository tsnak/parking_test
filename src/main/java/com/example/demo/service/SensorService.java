package com.example.demo.service;

import com.example.demo.repository.ParkingLotRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SensorService {

    private final ParkingLotRepository parkingLotRepository;

    public SensorService(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }


    @Transactional
    public void updateParkingLot(Boolean isFree, Long id) {
        this.parkingLotRepository.updateParkingLot(isFree, id);
    }
}
