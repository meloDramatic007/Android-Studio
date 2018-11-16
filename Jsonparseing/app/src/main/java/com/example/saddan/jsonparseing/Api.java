package com.example.saddan.jsonparseing;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api
{
    String BASE_URL="http:/services.hanselandpetal.com/feeds/";
    @GET("flowers.json")
    Call<ArrayList<Flower>>getFlowerList();
}
