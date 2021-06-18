package hrmsSystem.hrms.core.utilities.adapters.concretes;

import hrmsSystem.hrms.business.abstracts.EmailVerificationService;
import hrmsSystem.hrms.business.abstracts.EmployerService;
import hrmsSystem.hrms.business.abstracts.JobSeekerService;
import hrmsSystem.hrms.business.concretes.EmailVerificationManager;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Users;
import org.apache.tomcat.jni.User;

public class EmailAuthManager {

    public static boolean Auth(Users users, String code){
        System.out.println("Email authentication has been completed Email: "+users.getEmail()+" Validation code:"+code);
        return true;
    }


}
