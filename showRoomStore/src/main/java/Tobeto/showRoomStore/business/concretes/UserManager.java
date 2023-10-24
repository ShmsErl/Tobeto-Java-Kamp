package Tobeto.showRoomStore.business.concretes;

import Tobeto.showRoomStore.business.Abstract.IUserService;
import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.core.utilities.result.SuccessDataResult;
import Tobeto.showRoomStore.core.utilities.result.SuccessResult;
import Tobeto.showRoomStore.dataAccess.concretes.IUserRepository;
import Tobeto.showRoomStore.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserManager implements IUserService {


    @Autowired
    private IUserRepository iUserRepository;


    @Override
    public DataResult<List<User>> getAllUser() {
        List<User> user = this.iUserRepository.findAll();
        return new SuccessDataResult<List<User>>("İşlem Başarılı", user);
        //return getAllUser;
    }

    @Override
    public Result add(User user) {



        User user1 = new User();
        user1.setId(user.getId());
        user1.setFirstName(user.getFirstName());
        user1.setLastName(user.getLastName());
        user1.setEMail(user.getEMail());
        user1.setPassword(user.getPassword());
        user1.setCountry(user.getCountry());
        user1.setAge(user.getAge());
        user1.setActive(user.isActive());
        user1.setAuthorizationStatus(user.isAuthorizationStatus());


        this.iUserRepository.save(user1);

        return new SuccessResult( "İşlem Başarılı") ;


    }

    @Override
    public Result delete(int id) {

        User user = this.iUserRepository.getReferenceById(id);

        this.iUserRepository.delete(user);
        return new SuccessResult("İşlem Başarılı" + user.getFirstName() + " Başarı ile silindi ");
    }

    @Override
    public Result update(int id, User user) {
        User updateUser = this.iUserRepository.getReferenceById(id);
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setEMail(user.getEMail());
        updateUser.setPassword(user.getPassword());
        updateUser.setCountry(user.getCountry());
        updateUser.setAge(user.getAge());
        updateUser.setActive(user.isActive());
        updateUser.setAuthorizationStatus(user.isAuthorizationStatus());

        this.iUserRepository.save(updateUser);
        return new SuccessResult("Güncelleme Başarılı");
    }


}
