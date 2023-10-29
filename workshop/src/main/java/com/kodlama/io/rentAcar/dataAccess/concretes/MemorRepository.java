package com.kodlama.io.rentAcar.dataAccess.concretes;

import com.kodlama.io.rentAcar.dataAccess.abstracts.IBrandRepository;
import com.kodlama.io.rentAcar.entities.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MemorRepository implements IBrandRepository {


    public List<Brand> brands;

    public MemorRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"Audi"));
        brands.add(new Brand(2,"BMW"));
        brands.add(new Brand(3,"Mercedes"));
        brands.add(new Brand(4,"Volkswagen"));

    }

    @Override
    public List<Brand> getAll() {
        System.out.println("---------------------------------------------");
        System.out.println(" Marka Listesi  Başarıyla Getirildi.");

        return brands;
    }
    @Override
    public void add(Brand brand){
        System.out.println("-------------------EKLEME İŞLEMİ--------------------------");

        this.brands.add(brand);
        System.out.println(brand.getName() + " Başarıyla Eklendi.");
    }

    @Override
    public void updateBrand(int id, Brand brand) {
        System.out.println("-------------------GÜNCELLEME İŞLEMİ--------------------------");
        this.brands.set(id,brand);
        System.out.println( brand.getName() + " "+ brand.getId()+" id'li"  + " Güncelleme İşlemi");
    }

    @Override
    public void deleteBrand(Brand brand) {
        System.out.println("-------------------SİLME İŞLEMİ--------------------------");
        this.brands.remove(this.brands.indexOf(brand));
        System.out.println(brand.getName() + " Başarıyla Silindi.");
    }




}
