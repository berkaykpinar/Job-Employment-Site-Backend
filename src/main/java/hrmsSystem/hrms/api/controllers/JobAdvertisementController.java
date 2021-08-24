package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.JobAdvertisementService;
import hrmsSystem.hrms.business.concretes.JobAdvertisementManager;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvertisement")
@CrossOrigin
public class JobAdvertisementController {
    private JobAdvertisementService jobAdvertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
        this.jobAdvertisementService = jobAdvertisementService;
    }

    @GetMapping("/listByDate")
    public DataResult<List<JobAdvertisement>> listByDate(){
        return this.jobAdvertisementService.listByDate();
    }

    @GetMapping("/listByIsApproved")
    public DataResult<List<JobAdvertisement>> listByIsApproved(){
        return this.jobAdvertisementService.listByIsApproved();
    }

    @GetMapping("/getByAdId")
    public DataResult<JobAdvertisement> getByAdvertisemetnID(int adId){

        return this.jobAdvertisementService.getByAdvertisementId(adId);
    }


    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement){
        return this.jobAdvertisementService.add(jobAdvertisement);
    }

    @PostMapping("/updateStatus")
    public Result update(int adId,boolean status){
        return this.jobAdvertisementService.updateStatus(adId,status);
    }


}
