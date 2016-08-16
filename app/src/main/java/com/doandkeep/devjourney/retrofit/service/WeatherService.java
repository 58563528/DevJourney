package com.doandkeep.devjourney.retrofit.service;

import com.doandkeep.devjourney.bean.weather.WeatherWrapper;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.http.Url;

/**
 * Created by zhangtao on 16/8/11.
 */
public interface WeatherService {
    @Headers("apikey:b86c2269fe6588bbe3b41924bb2f2da2")
    @GET
    Call<WeatherWrapper> weather(@Url String url, @Query("cityname") String cityName);

    @GET
    Call<WeatherWrapper> weather(@Header("apikey") String apikey, @Url String url, @Query("cityname") String cityName);

    @GET
    Call<WeatherWrapper> weather(@HeaderMap Map<String, String> headers, @Url String url, @Query("cityname") String cityName);

}
