package Tobeto.showRoomStore.dataAccess.concretes;

import Tobeto.showRoomStore.entities.concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
