package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    DataResult<List<JobAdvertisement>> listByDate();
    Result add(JobAdvertisement jobAdvertisement);
    DataResult<JobAdvertisement> getByAdvertisementId(int adId);
    DataResult<List<JobAdvertisement>> listByIsApproved();
    Result updateStatus(int adId,boolean status);
}
