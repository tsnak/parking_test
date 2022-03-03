package com.example.demo.controller;

import com.example.demo.service.SensorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sensor")
public class SensorController {

    private final SensorService sensorService;

    public SensorController(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    /**
     * Изменить статус парковочного места. Для датчиков.
     * @param isFree свободно ли
     * @param id идентификатор парковочного места
     */
    @PostMapping("/update_status")
    public void getFreeLotsCount(@RequestParam Boolean isFree, @RequestParam Long id) {
        sensorService.updateParkingLot(isFree, id);
    }
}
