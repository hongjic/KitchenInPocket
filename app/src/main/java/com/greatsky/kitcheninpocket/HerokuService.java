package com.greatsky.kitcheninpocket;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by lshbritta on 16/11/13.
 */

public interface HerokuService {
    @Headers({
            "Accept: application/json",
            "Content-type: application/json;charset=utf-8"
    })

    @POST("/api/v1/users/login")
    Call<ResponseBody> login(@Body User user);
}