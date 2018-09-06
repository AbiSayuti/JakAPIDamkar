package com.abisayuti.jakapi.Network;

import com.abisayuti.jakapi.Model.ResponsePostDamkar;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

/**
 * Created by abisayuti on 9/6/18.
 */

public interface ApiService {

    @GET("pospemadam")
    Call<ResponsePostDamkar> requestPostPemadam(

        @Header("Authorization") String authorization
    );



}
