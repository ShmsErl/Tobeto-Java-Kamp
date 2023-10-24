package Tobeto.showRoomStore.webApi.controller;
import Tobeto.showRoomStore.business.Abstract.IUserService;
import Tobeto.showRoomStore.core.utilities.result.DataResult;
import Tobeto.showRoomStore.core.utilities.result.Result;
import Tobeto.showRoomStore.entities.concretes.User;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
//@AllArgsConstructor
@RequiredArgsConstructor
public class UserController {

    private final IUserService iUserService;


        @GetMapping("/getAll")
        public DataResult<List<User>> getAllUser() {
            return this.iUserService.getAllUser();
        }

        @PostMapping()
        public Result add(@RequestBody User user) {
            return this.iUserService.add(user);
        }

        @DeleteMapping("/{id}")
        public Result delete(@PathVariable int id) {
            return this.iUserService.delete( id);
        }
        @PutMapping("/{id}")
        public Result update(@PathVariable int id, @RequestBody User user){
            return  this.iUserService.update(id,user);


        }








}
