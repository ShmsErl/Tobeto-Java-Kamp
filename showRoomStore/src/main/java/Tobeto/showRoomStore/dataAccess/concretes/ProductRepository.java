package Tobeto.showRoomStore.dataAccess.concretes;

import Tobeto.showRoomStore.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
