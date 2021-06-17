package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.entities.concretes.ActivePositions;
import hrmsSystem.hrms.entities.concretes.Users;

import java.util.List;

public interface UserService {
    List<Users> getAll();
}
