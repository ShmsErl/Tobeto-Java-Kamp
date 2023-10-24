package Tobeto.showRoomStore.webApi.controller;

import Tobeto.showRoomStore.business.Abstract.IProductService;
import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@AllArgsConstructor
public class ProductController {

    private final IProductService iProductService;


    @GetMapping("/getall")
    public DataResult<List<Product>> getAllProduct() {

        return this.iProductService.getAllProduct();
    }

    @PostMapping("/add")
    public Result createNewProduct(@RequestBody Product product){

        return  this.iProductService.createNewProduct(product);
    }

    @PutMapping("/{id}")
    public Result updateProduct(@PathVariable int id, @RequestBody Product product){

        return this.iProductService.updateProduct(id, product );
    }

    @DeleteMapping("/{id}")
    public Result updateProduct(@PathVariable int id){

        return this.iProductService.deleteProduct(id);
    }
}