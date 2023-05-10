package com.idrissa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/v1/gov/districts")
public class Main {
    private final DistrictRepository districtRepository;

    public Main(DistrictRepository districtRepository) {
        this.districtRepository = districtRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }


    @GetMapping
    public List<District> getDistricts() {
        return districtRepository.findAll();
    }
}
