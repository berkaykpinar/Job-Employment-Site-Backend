package hrmsSystem.hrms.dataAccess.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Favorites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FavoritesDao extends JpaRepository<Favorites,Integer> {

    @Transactional
    @Modifying
    @Query("delete from Favorites f where f.favAdId=:adId and f.jobSeekers.id=:userId")
    void deleteFavoriteAd(@Param(value = "adId") int adId,@Param(value = "userId") int userId);

    @Query("from Favorites f where f.jobSeekers.id=:userId")
    List<Favorites> getFavoritesByUserID(@Param(value = "userId") int userId);
}
