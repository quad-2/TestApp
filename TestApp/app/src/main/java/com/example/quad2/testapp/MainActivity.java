package com.example.quad2.testapp;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private RecyclerView categoryRV;
    private RecyclerView storeRV;

    private static final String BASE_URL = "http://ec2-54-169-238-70.ap-southeast-1.compute.amazonaws.com:5000";
    private static final int MY_PERMISSIONS_REQUEST_INTERNET = 100;


    private ArrayList<String> categoryList;
    private List<Business> businessList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        askPermission();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void setStoreAdapter() {
        storeRV = (RecyclerView) findViewById(R.id.stores_rv);
        StoresAdapter storesAdapter = new StoresAdapter(MainActivity.this, businessList);
        storeRV.setHasFixedSize(true);
        LinearLayoutManager llmV = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
        storeRV.setLayoutManager(llmV);
        storeRV.setAdapter(storesAdapter);
        storesAdapter.notifyDataSetChanged();
    }

    public void setCategoryAdapter() {
        populateCategoryList();
        categoryRV = (RecyclerView) findViewById(R.id.categories_rv);
        CategoryAdapter categoryAdapter = new CategoryAdapter(MainActivity.this, categoryList);
        categoryRV.setHasFixedSize(true);
        LinearLayoutManager llmH = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        categoryRV.setLayoutManager(llmH);
        categoryRV.setAdapter(categoryAdapter);
        categoryAdapter.notifyDataSetChanged();

    }

    public void populateCategoryList() {
        categoryList = new ArrayList<>();
        categoryList.add("Pet Care");
        categoryList.add("Night Life");
        categoryList.add("Electronics");
        categoryList.add("Baby Care");
        categoryList.add("Street Food");
        categoryList.add("House Care");
        categoryList.add("Restaurants");
        categoryList.add("Hospitals");
        categoryList.add("Market");
    }

    private void askPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && checkSelfPermission(Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.INTERNET}, MY_PERMISSIONS_REQUEST_INTERNET);
        } else {
            getData();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        if (requestCode == MY_PERMISSIONS_REQUEST_INTERNET) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Permission is granted
                askPermission();
            } else {
                Toast.makeText(this, "Until you grant the permission, we can't get the data", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void getData() {
        setCategoryAdapter();
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(15, TimeUnit.SECONDS);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();

        StoresApi storesApi = retrofit.create(StoresApi.class);
        Call<Data> call = storesApi.getStoreList();

        call.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, retrofit2.Response<Data> response) {
                businessList.clear();

                try {
                    for (Business business : response.body().getBusinesses()) {
                        businessList.add(business);
                        //Log.d("", response.body().toString());
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
                setStoreAdapter();
            }

            @Override
            public void onFailure(Call<Data> call, Throwable t) {
                t.printStackTrace();
                Toast.makeText(MainActivity.this, "Network Error", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
