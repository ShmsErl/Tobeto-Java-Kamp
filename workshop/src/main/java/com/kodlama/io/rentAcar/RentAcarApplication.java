package com.kodlama.io.rentAcar;

import com.kodlama.io.rentAcar.business.abstracts.BrandService;
import com.kodlama.io.rentAcar.business.concretes.BrandManager;
import com.kodlama.io.rentAcar.business.Rules.utilities.BusinessRules;
import com.kodlama.io.rentAcar.dataAccess.abstracts.IBrandRepository;
import com.kodlama.io.rentAcar.dataAccess.concretes.MemorRepository;
import com.kodlama.io.rentAcar.entities.Brand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RentAcarApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RentAcarApplication.class, args);



		IBrandRepository iBrandRepository = new MemorRepository();

		BrandService brandService = new BrandManager( iBrandRepository,new BusinessRules(iBrandRepository));

		List<Brand> brands = brandService.getAll();


		Brand brand = new Brand(5,"Hyundai");
		Brand brand1 = new Brand(6,"TOGG");
		Brand brand2= new Brand(7,"Fiat");
		Brand brand3 = new Brand(8,"Tesla");


		for (Brand brandToList :brands ) {

			brandToList.info();

		}


		brandService.add(brand);
		brandService.add(brand1);
		brandService.add(brand2);
		brandService.add(brand3);


		for (Brand brandToList :brands ) {

			brandToList.info();

		}

		brandService.deleteBrand(brand);

		brandService.updateBrand(1,new Brand(2,"Range Rover"));

		/*Buradaki işlemler iş kurallarına uymadığı için sonuç olarak bir Exception fırlatır.
		brandService.add(new Brand(9,"Audi"));
		brandService.updateBrand(6,new Brand(8,"TOGG"));
		brandService.deleteBrand(new Brand(8,"Toyota"));
	*/


			for (Brand brandToList :brands ) {

			brandToList.info();

		}

	}

}
