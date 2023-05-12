package com.idrissa;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

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

    record NewDistrictRequest(String district_name){}
    @PostMapping
    public void addDistrict( @RequestBody NewDistrictRequest request){
        // get reference to district modal
        District district = new District();
        // set values
        district.setDistrictName(request.district_name());
        districtRepository.save(district);
    }



    @DeleteMapping("{districtId}")
    public void deleteDistrict(@PathVariable("districtId") Integer id){
        districtRepository.deleteById(id);
    }
}
