package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.Employers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employers,Integer> {


}
