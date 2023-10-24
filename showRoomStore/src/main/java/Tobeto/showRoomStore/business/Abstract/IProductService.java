package Tobeto.showRoomStore.business.Abstract;

import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.entities.concretes.Product;

import java.util.List;

public interface IProductService {

    DataResult<List<Product>> getAllProduct();

    Result createNewProduct(Product product);
    Result updateProduct(int id ,Product  product);
    Result deleteProduct(int id);
    DataResult<Product> getElementById(int id);


}


