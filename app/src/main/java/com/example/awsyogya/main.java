package com.example.awsyogya;

import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.awsyogya.api.ApiService;
import com.example.awsyogya.model.ApiResponse;
import com.example.awsyogya.model.DataBmkg;
import com.example.awsyogya.network.Network;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class main extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, SwipeRefreshLayout.OnRefreshListener {
    public static final String ROOT_URL = "http://10.0.2.2/aws_bmkg/";

    private Fragment fragment;
    public static DataBmkg dataBmkg= null;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getApi();
//        if (getFragmentManager().findFragmentById(R.id.frame_fragment)==null){
//            fragment = new HomeFragment();
//            changeFragment(fragment);
//            getSupportActionBar().setTitle("Home");
//        }
    }


    public static void  getApi(){
        ApiService api = Network.getRetrofit().create(ApiService.class);
        api.getData().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                dataBmkg = response.body().getData()[0];
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
            }
        });
    }

    public static void  getApi(final SwipeRefreshLayout swipeRefreshLayout){
        ApiService api = Network.getRetrofit().create(ApiService.class);
        api.getData().enqueue(new Callback<ApiResponse>() {
            @Override
            public void onResponse(Call<ApiResponse> call, Response<ApiResponse> response) {
                swipeRefreshLayout.setRefreshing(false);
                dataBmkg = response.body().getData()[0];
            }

            @Override
            public void onFailure(Call<ApiResponse> call, Throwable t) {
                swipeRefreshLayout.setRefreshing(false);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            fragment = new HomeFragment();
            changeFragment(fragment);
            getSupportActionBar().setTitle("Home");
        } else if (id == R.id.nav_Monitoring) {
            fragment = new MonitoringFragment();
            changeFragment(fragment);
            getSupportActionBar().setTitle("Monitoring");
        } else if (id == R.id.nav_Link) {
            fragment= new LinkFragment();
            changeFragment(fragment);
            getSupportActionBar().setTitle("Link");
        } else if (id == R.id.nav_about) {
            fragment=new AboutFragment();
            changeFragment(fragment);
            getSupportActionBar().setTitle("About");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void changeFragment(Fragment fragment) {
      FragmentManager manager = getSupportFragmentManager();
      FragmentTransaction fragmentTransaction = manager.beginTransaction();
      fragmentTransaction.replace(R.id.frame_fragment, fragment)
      .addToBackStack("Fragment")
      .commit();
    }
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Do you want to Exit?");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }


    @Override
    public void onRefresh() {
        getApi();
    }
}


