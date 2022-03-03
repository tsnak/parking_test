package com.example.demo.controller;

import com.example.demo.service.ParkingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/parking")
public class ParkingController {

    private final ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    /**
     * �������� ���������� ��������� ����. ��� ���������.
     * @return ���������� ��������� ����
     */
    @GetMapping("/free_places_count")
    public Long getFreeLotsCount() {
        return parkingService.getFreeLotsCount();
    }

    /**
     * �������� ������ ��������� ���� (�� id). ��� �����.
     * @return ������ ��������� ���� (�� id)
     */
    @GetMapping("/free_places")
    public List<Long> getFreeLots() {
        return parkingService.getFreeLots();
    }
}