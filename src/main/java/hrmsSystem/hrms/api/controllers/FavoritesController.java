package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.FavoritesService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.entities.concretes.Favorites;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/favorites")
@CrossOrigin
public class FavoritesController {
    private FavoritesService favoritesService;

    @Autowired
    public FavoritesController(FavoritesService favoritesService) {
        this.favoritesService = favoritesService;
    }

    @PostMapping("/add")
    public Result addFavorite(@RequestBody Favorites favorites){
        this.favoritesService.addFavorites(favorites);
        return new SuccessResult();
    }

    @GetMapping("/getAll")
    public DataResult<List<Favorites>> getAll(int userId){
       return this.favoritesService.getFavorites(userId);
    }

    @PostMapping("/delete")
    public Result deleteFavoriteAd(int adId,int userId){
        return this.favoritesService.deleteFavoriteAd(adId,userId);
    }

}
