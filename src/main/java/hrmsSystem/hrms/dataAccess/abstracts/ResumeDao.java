package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Resume;
import hrmsSystem.hrms.entities.dtos.ResumeWithAllInformationsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResumeDao extends JpaRepository<Resume,Integer> {

    @Query("from Resume r where r.jobSeekers.id=:seekerId")
    List<Resume> findResumeByJobSeekers_Id(int seekerId);

//    @Query("select new hrmsSystem.hrms.entities.dtos.ResumeWithAllInformationsDto")
//    List<ResumeWithAllInformationsDto> getResumesByJobSeekers_Id(int jobSeekerId);


}
