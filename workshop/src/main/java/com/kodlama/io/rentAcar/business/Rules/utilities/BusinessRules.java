package com.kodlama.io.rentAcar.business.Rules.utilities;

import com.kodlama.io.rentAcar.dataAccess.abstracts.IBrandRepository;
import com.kodlama.io.rentAcar.entities.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class BusinessRules implements  IBrandBusinessRules {

    private IBrandRepository brandRepository;


    @Override
    public void ifCheckBrandId(int id) throws Exception {

        for (Brand brands: this.brandRepository.getAll()) {

            if(brands.getId() == id){
                throw new Exception("Eklemek istediğiniz ürün zaten mevcut.");
            }
        }
    }

    @Override
    public void ifCheckBrandName(String name) throws Exception {

        for (Brand brands: this.brandRepository.getAll()) {

            if(brands.getName()==name ){
                throw new Exception("Güncellemek istediğiniz ürün zaten mevcut.");
            }



        }


    }
}
