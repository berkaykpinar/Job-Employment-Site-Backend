package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.JobAdvertisementService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.JobAdvertisementDao;
import hrmsSystem.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
   private JobAdvertisementDao jobAdvertisementDao;

   @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
        this.jobAdvertisementDao = jobAdvertisementDao;
    }

    @Override
    public DataResult<List<JobAdvertisement>> listByDate() {
        Sort sort = Sort.by(Sort.Direction.ASC,"deadline");
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getByLastDateAndIsActive(sort));
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
       this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("Job advertisement has been added!");
    }

    @Override
    public DataResult<JobAdvertisement> getByAdvertisementId(int adId) {
        return new SuccessDataResult<JobAdvertisement>(jobAdvertisementDao.getByAdId(adId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> listByIsApproved() {
        return new SuccessDataResult<List<JobAdvertisement>>(jobAdvertisementDao.getByIsApproved());
    }

    @Override
    public Result updateStatus(int adId,boolean status) {
        this.jobAdvertisementDao.updateStatus(adId,status);
        return new SuccessResult(adId+" number advertisement succesfully approved");
    }


}
