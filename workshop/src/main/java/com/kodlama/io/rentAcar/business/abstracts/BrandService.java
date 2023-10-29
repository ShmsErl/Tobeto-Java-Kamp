package com.kodlama.io.rentAcar.business.abstracts;

import com.kodlama.io.rentAcar.entities.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();
    void add(Brand brand) throws Exception;

    void updateBrand(int id , Brand brand) throws Exception;

    void deleteBrand(Brand brand) throws Exception;

    Brand getElementById(int id);
}
