package com.example.awsyogya;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.awsyogya.api.ApiService;
import com.example.awsyogya.adapter.list_array_adapter;

import com.example.awsyogya.model.ApiResponse;
import com.example.awsyogya.network.Network;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class daftar extends AppCompatActivity implements AdapterView.OnItemClickListener {


    ArrayList<ApiResponse> daftar = new ArrayList<ApiResponse>();
    ListView listview;
    list_array_adapter adapter;

    LinearLayout layout_loading;
    TextView text_load;
    ImageView icon_load;


    public void setup() {

        ApiService service = Network.getRetrofit().create(ApiService.class);

        Call<ApiResponse> call = service.getData();


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            adapter.clear();
            setup();
            Log.d("network","test");
        }
    }
}
