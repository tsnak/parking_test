package com.example.demo;

import com.example.demo.model.ParkingLot;
import com.example.demo.repository.ParkingLotRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.stream.IntStream;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @PostConstruct
    public void insertParkingPlace() {
    }
}
