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
     * Получить количество свободных мест. Для шлагбаума.
     * @return количество свободных мест
     */
    @GetMapping("/free_places_count")
    public Long getFreeLotsCount() {
        return parkingService.getFreeLotsCount();
    }

    /**
     * Получить список свободных мест (их id). Для табло.
     * @return список свободных мест (их id)
     */
    @GetMapping("/free_places")
    public List<Long> getFreeLots() {
        return parkingService.getFreeLots();
    }
}