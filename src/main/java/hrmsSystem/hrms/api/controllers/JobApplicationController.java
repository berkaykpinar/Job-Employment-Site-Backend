package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.JobApplicationService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.JobApplications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
@CrossOrigin
public class JobApplicationController {
    private JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping("/getApplicationsByAdId")
    public DataResult<List<JobApplications>> getApplicationsByAdId(int advertisementId){
        return jobApplicationService.getApplicationsByAdId(advertisementId);
    }
    @GetMapping("/getApplicationsByUserId")
    public DataResult<List<JobApplications>> getApplicationsByUserId(int userId){
        return jobApplicationService.getApplicationByUserId(userId);
    }

    @PostMapping("/add")
    public Result addApplication(@RequestBody JobApplications jobApplications){
        return this.jobApplicationService.addApplication(jobApplications);
    }
}
