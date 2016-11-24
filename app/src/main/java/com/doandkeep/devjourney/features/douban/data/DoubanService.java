package com.doandkeep.devjourney.features.douban.data;

import com.doandkeep.devjourney.features.douban.data.entity.DoubanMovieListEntity;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by zhangtao on 16/8/5.
 */
public interface DoubanService {

    @GET("movie/in_theaters")
    Observable<DoubanMovieListEntity> movieForInTheaters(@Query("city") String city);
}
