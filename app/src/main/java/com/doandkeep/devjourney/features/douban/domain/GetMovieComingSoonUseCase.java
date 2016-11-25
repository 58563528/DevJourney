package com.doandkeep.devjourney.features.douban.domain;

import com.doandkeep.devjourney.base.domain.UseCase;
import com.doandkeep.devjourney.features.douban.domain.repository.DoubanMovieRepo;

import rx.Observable;

/**
 * Created by zhangtao on 2016/11/24.
 */

public class GetMovieComingSoonUseCase extends UseCase {

    private DoubanMovieRepo mDoubanMovieRepo;
    private String mCity;

    public GetMovieComingSoonUseCase(DoubanMovieRepo doubanMovieRepo, String city) {
        this.mDoubanMovieRepo = doubanMovieRepo;
        this.mCity = city;
    }

    @Override
    protected Observable buildUseCaseObservable() {
        return this.mDoubanMovieRepo.movieListForComingSoon(mCity);
    }
}
