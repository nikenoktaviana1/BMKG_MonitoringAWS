package com.example.awsyogya.api;

import com.example.awsyogya.model.ApiResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api.php/data")
    Call<ApiResponse> getData();
}
