package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.JobApplicationService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.JobApplicationDao;
import hrmsSystem.hrms.entities.concretes.JobApplications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobApplicationManager implements JobApplicationService {
    private JobApplicationDao jobApplicationDao;

    @Autowired
    public JobApplicationManager(JobApplicationDao jobApplicationDao) {
        this.jobApplicationDao = jobApplicationDao;
    }

    @Override
    public DataResult<List<JobApplications>> getApplicationsByAdId(int advertisementID) {
        return new SuccessDataResult<List<JobApplications>>(this.jobApplicationDao.getByAdvertisementId(advertisementID));
    }

    @Override
    public Result addApplication(JobApplications jobApplications) {

        this.jobApplicationDao.save(jobApplications);
        return new SuccessResult("Application added");
    }

    @Override
    public DataResult<List<JobApplications>> getApplicationByUserId(int userId) {
        return new SuccessDataResult<List<JobApplications>>(this.jobApplicationDao.getJobApplicationsByJobSeekerId(userId));
    }
}
