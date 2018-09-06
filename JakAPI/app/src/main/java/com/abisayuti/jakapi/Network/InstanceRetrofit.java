package com.abisayuti.jakapi.Network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by abisayuti on 9/6/18.
 */

public class InstanceRetrofit {

   public static String url = "http://api.jakarta.go.id/v1/emergency/";
    public static Retrofit setInit(){

        return new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    public static ApiService getInstance() {
        return setInit().create(ApiService.class);
    }
}
