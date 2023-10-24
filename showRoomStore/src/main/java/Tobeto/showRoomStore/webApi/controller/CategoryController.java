package Tobeto.showRoomStore.webApi.controller;

import Tobeto.showRoomStore.business.Abstract.ICategoryService;
import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.entities.concretes.Category;
import Tobeto.showRoomStore.entities.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
@AllArgsConstructor
public class CategoryController {
    private final ICategoryService iCategoryService;

    @GetMapping("/getall")
    public DataResult<List<Category>> getAllProduct() {

        return this.iCategoryService.getAllCategory();
    }
    @PostMapping("/add")
    public Result createNewCategory(@RequestBody  Category category){

        return this.iCategoryService.createNewCategory(category);
    }
}
