package com.example.awsyogya.network;

import okhttp3.OkHttpClient;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Network {
    private static String API_BASE_URL = "http://192.168.43.252/aws_bmkg/";
    private static String API_BASE_URL_ASRS = "http://192.168.43.148/aws_bmkg/";
    private static Retrofit retrofit;
    private static Retrofit retrofit2;


// set log level




    public static Retrofit getRetrofit(){
        HttpLoggingInterceptor loging = new HttpLoggingInterceptor();
        loging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(loging).build();

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient.build())
                    .build();
        }
        return retrofit;

    }
    public static Retrofit getRetrofit2(){
        HttpLoggingInterceptor loging = new HttpLoggingInterceptor();
        loging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(loging).build();

        if (retrofit2 == null){
            retrofit2 = new Retrofit.Builder()
                    .baseUrl(API_BASE_URL_ASRS)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient.build())
                    .build();
        }
        return retrofit2;

    }

}
