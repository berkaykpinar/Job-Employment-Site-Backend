package hrmsSystem.hrms.business.abstracts;

import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.entities.concretes.Favorites;

import java.util.List;

public interface FavoritesService {
    DataResult<List<Favorites>> getFavorites(int userId);
    Result addFavorites(Favorites favorites);
    Result deleteFavoriteAd(int adId,int userId);
}
