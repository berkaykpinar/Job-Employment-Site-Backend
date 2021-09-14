package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.entities.concretes.JobApplications;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobApplicationDao extends JpaRepository<JobApplications,Integer> {

    List<JobApplications> getByAdvertisementId(int advertisementId);

    List<JobApplications> getJobApplicationsByJobSeekerId(int userId);

}
