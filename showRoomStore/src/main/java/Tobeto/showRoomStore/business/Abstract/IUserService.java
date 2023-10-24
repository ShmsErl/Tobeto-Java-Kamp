package Tobeto.showRoomStore.business.Abstract;

import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.entities.concretes.User;

import java.util.List;

public interface IUserService {


    DataResult<List<User>> getAllUser() ;

    Result add(User user);

    Result delete(int id);

    Result update(int id,User user);

}
