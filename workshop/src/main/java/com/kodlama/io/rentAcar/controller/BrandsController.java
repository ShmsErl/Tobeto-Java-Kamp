package com.kodlama.io.rentAcar.controller;

import com.kodlama.io.rentAcar.business.abstracts.BrandService;
import com.kodlama.io.rentAcar.entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/brand")
@RestController
public class BrandsController {

    private BrandService brandService;
    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }


    @GetMapping("/getAll")
    public List<Brand> getAll(){

        return this.brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Brand brand) throws Exception {

        this.brandService.add(brand);
    }
}
