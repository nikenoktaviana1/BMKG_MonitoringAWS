package com.example.awsyogya.api;

import com.example.awsyogya.model.ApiResponse;
import com.example.awsyogya.model.AsrsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServiceAsrs {
    @GET("api_asrs.php/data")
    Call<AsrsResponse> getData();
}
