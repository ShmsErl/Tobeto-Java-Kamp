package com.kodlama.io.rentAcar.business.concretes;

import com.kodlama.io.rentAcar.business.abstracts.BrandService;
import com.kodlama.io.rentAcar.business.Rules.utilities.IBrandBusinessRules;
import com.kodlama.io.rentAcar.dataAccess.abstracts.IBrandRepository;
import com.kodlama.io.rentAcar.entities.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private final IBrandRepository brandRepository;
    private final IBrandBusinessRules iBrandBusinessRules;


    @Autowired
    public BrandManager(IBrandRepository brandRepository, IBrandBusinessRules iBrandBusinessRules) {
        this.brandRepository = brandRepository;
        this.iBrandBusinessRules = iBrandBusinessRules;
    }

    @Override
    public List<Brand> getAll() {
        return this.brandRepository.getAll();
    }

    @Override
    public void add(Brand brand) throws Exception {

        this.iBrandBusinessRules.ifCheckBrandId(brand.getId());
        this.iBrandBusinessRules.ifCheckBrandName(brand.getName());
        this.brandRepository.add(brand);


    }

    @Override
    public void updateBrand(int id, Brand brand) throws Exception {

        this.iBrandBusinessRules.ifCheckBrandName(brand.getName());
        this.brandRepository.updateBrand(id,brand);

    }

    @Override
    public void deleteBrand(Brand brand) throws Exception {




        this.brandRepository.deleteBrand(brand);

    }

    @Override
    public Brand getElementById(int id) {
        return null;
    }
}
