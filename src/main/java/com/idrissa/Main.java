package com.idrissa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
@GetMapping("/api/v1/gov/district")
    public DistrictListing district() {
    DistrictListing response = new DistrictListing(
            "Rwanda",
            List.of("Kayonza", "Nyarugenge", "Rusizi"),
            new Mayor("Muvunyi Idrissa", 34)
    );
    return response;
    }

    record Mayor(String name, int age){}
    record DistrictListing(
            String country,
            List<String> districts,
            Mayor mayor
            ){}

}
