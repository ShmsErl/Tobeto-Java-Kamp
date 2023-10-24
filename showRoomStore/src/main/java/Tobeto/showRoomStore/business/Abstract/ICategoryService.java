package Tobeto.showRoomStore.business.Abstract;

import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.entities.concretes.Category;

import java.util.List;

public interface ICategoryService {

    DataResult<List<Category>> getAllCategory();

    Result createNewCategory(Category category);

    Result updateCategory(int id, Category category);

    Result deleteCategory(int id);

    DataResult<Category> getElementById(int id);

}
