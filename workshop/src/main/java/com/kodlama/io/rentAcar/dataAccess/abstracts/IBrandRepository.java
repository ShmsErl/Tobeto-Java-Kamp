package com.kodlama.io.rentAcar.dataAccess.abstracts;

import com.kodlama.io.rentAcar.entities.Brand;

import java.util.List;

public interface IBrandRepository {

    List<Brand> getAll();

    void add(Brand brand);

    void updateBrand(int id,Brand brand);

    void deleteBrand(Brand  brand);



}
