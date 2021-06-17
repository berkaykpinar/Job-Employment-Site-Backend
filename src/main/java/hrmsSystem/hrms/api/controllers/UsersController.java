package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.UserService;
import hrmsSystem.hrms.entities.concretes.ActivePositions;
import hrmsSystem.hrms.entities.concretes.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private UserService userService;

    @Autowired
    public UsersController(UserService userService){
        this.userService=userService;
    }

    @GetMapping("/getall")
    public List<Users> getAll() {
        //System.out.println(getAll().toArray());
        return this.userService.getAll();
    }


}
