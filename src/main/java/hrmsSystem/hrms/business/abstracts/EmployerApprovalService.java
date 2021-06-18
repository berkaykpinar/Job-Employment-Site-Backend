package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.EmployerApproval;
import hrmsSystem.hrms.entities.concretes.Employers;
import hrmsSystem.hrms.entities.concretes.SystemPersonnel;

import java.util.List;

public interface EmployerApprovalService {

    boolean process(Employers employers);

    DataResult<List<EmployerApproval>> getAll();


}
