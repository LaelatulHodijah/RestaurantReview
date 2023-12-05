package com.example.restaurantreview;

import retrofit2.Call;
import retrofit2.http.Path;
import retrofit2.http.GET;


interface ApiService{
    @GET("detail/{id}")
    Call<RestaurantResponse> getRestaurant(@Path("id") String id);
}
