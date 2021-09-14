package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.JobApplications;

import java.util.List;

public interface JobApplicationService {
    DataResult<List<JobApplications>> getApplicationsByAdId(int advertisementID);
    Result addApplication(JobApplications jobApplications);
    DataResult<List<JobApplications>> getApplicationByUserId(int userId);


}
