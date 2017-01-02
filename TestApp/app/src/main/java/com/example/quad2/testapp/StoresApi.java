package com.example.quad2.testapp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by quad2 on 2/12/16.
 */

public interface StoresApi {

    @GET("/businesses")
    Call<Store> getStoreList();
}
