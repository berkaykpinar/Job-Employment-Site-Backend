package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.ResumeService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Resume;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resumes")
public class ResumeController {
    private ResumeService resumeService;

    @Autowired
    public ResumeController(ResumeService resumeService) {
        this.resumeService = resumeService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Resume>> getAll(){
        return this.resumeService.getAll();
    }

    @GetMapping("/getAllById")
    public DataResult<List<Resume>> getAllById( int jobSeekerId){

        return this.resumeService.getResumeByJobSeekerId(jobSeekerId);
    }

    @PostMapping("/add")
    public Result add(@RequestBody Resume resume){
        return this.resumeService.add(resume);
    }


}
