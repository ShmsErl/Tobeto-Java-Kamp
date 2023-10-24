package Tobeto.showRoomStore.business.concretes;

import Tobeto.showRoomStore.business.Abstract.IProductService;
import Tobeto.showRoomStore.business.Abstract.IUserService;
import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.core.utilities.result.SuccessDataResult;
import Tobeto.showRoomStore.core.utilities.result.SuccessResult;
import Tobeto.showRoomStore.dataAccess.concretes.IUserRepository;
import Tobeto.showRoomStore.dataAccess.concretes.ProductRepository;
import Tobeto.showRoomStore.entities.concretes.Category;
import Tobeto.showRoomStore.entities.concretes.Product;
import Tobeto.showRoomStore.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements IProductService {

    private final ProductRepository productRepository;


    @Override
    public DataResult<List<Product>> getAllProduct() {
        return new SuccessDataResult<List<Product>>("Ürün Başarı İle Çağrıldı. ", this.productRepository.findAll());
    }

    @Override
    public Result createNewProduct(Product product) {


                     Product createProduct =    Product
                        .builder()
                        .id(product.getId())
                        .productName(product.getProductName())
                        .quantity(product.getProductQuantity())
                        .unitPrice(product.getUnitPrice())
                        .imgUri(product.getImgUri())
                        .description(product.getDescription())
                        .isActive(product.isActive())
                        .category(product.getCategory()).build();

                     this.productRepository.save(createProduct);

        return new SuccessResult("Ürün Başarı İle Eklendi. ") ;

    }

    @Override
    public Result updateProduct(int id, Product product) {
        Product product1 = this.productRepository.getReferenceById(id);

        product1
                .builder()
                .id(product.getId())
                .productName(product.getProductName())
                .quantity(product.getProductQuantity())
                .unitPrice(product.getUnitPrice())
                .imgUri(product.getImgUri())
                .description(product.getDescription())
                .isActive(product.isActive())
                .category(product.getCategory()).build();
                this.productRepository.save(product1);

        return new SuccessResult("Ürün Başarı İle Güncellendi. ");
    }

    @Override
    public Result deleteProduct(int id) {
        Product product = this.productRepository.getReferenceById(id);
        this.productRepository.delete(product);
        return new SuccessResult("Ürün Başarı İle Silindi. " + " " + product.getProductName() );
    }

    @Override
    public DataResult<Product> getElementById(int id) {


        return new  SuccessDataResult<Product>("İstenilen Değer Bulundu : ", this.productRepository.getReferenceById(id));
    }
}
