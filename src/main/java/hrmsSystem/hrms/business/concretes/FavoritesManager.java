package hrmsSystem.hrms.business.concretes;

import hrmsSystem.hrms.business.abstracts.FavoritesService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.dataAccess.abstracts.FavoritesDao;
import hrmsSystem.hrms.entities.concretes.Favorites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritesManager implements FavoritesService {
    private FavoritesDao favoritesDao;


    @Autowired
    public FavoritesManager(FavoritesDao favoritesDao) {
        this.favoritesDao = favoritesDao;
    }

    @Override
    public DataResult<List<Favorites>> getFavorites(int userId) {
        return new SuccessDataResult<List<Favorites>>(this.favoritesDao.getFavoritesByUserID(userId));
    }

    @Override
    public Result addFavorites(Favorites favorites) {
        this.favoritesDao.save(favorites);
        return new SuccessResult("Favorite has been added");
    }

    @Override
    public Result deleteFavoriteAd(int adId,int userId) {
        this.favoritesDao.deleteFavoriteAd(adId,userId);
        return new SuccessResult("Your favorite advertisement succesfully deleted");
    }
}
