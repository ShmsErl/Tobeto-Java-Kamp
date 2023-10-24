package Tobeto.showRoomStore.dataAccess.concretes;

import Tobeto.showRoomStore.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
}
