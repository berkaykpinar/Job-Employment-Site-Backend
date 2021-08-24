package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.business.abstracts.JobAdvertisementService;
import hrmsSystem.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    @Query("From JobAdvertisement where isActive=true ")
    List<JobAdvertisement> getByLastDateAndIsActive(Sort sort);

    JobAdvertisement getByAdId(int adId);

    @Query("From JobAdvertisement where isApproved=false")
    List<JobAdvertisement> getByIsApproved();

    @Transactional
    @Modifying
    @Query("update JobAdvertisement j set j.isApproved=:status where j.adId=:adId")
    void updateStatus(@Param(value = "adId") int adId, @Param(value = "status") boolean status);


}
