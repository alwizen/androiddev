package com.croxzz.alwizen.dinperpa.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RequestInterface {

    @GET("diskominfo/api2.php")
    Call<JSONResponse> getJSON();
}
