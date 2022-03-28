package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    CitiesAdapter itemCountryAdappter;
    RecyclerView recyclerView;
    List<CitiesModel> citiesModelList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcv_cities);
//
        citiesModelList = new ArrayList<>();
        citiesModelList.add(new CitiesModel("Sai gon ",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("Da Nang",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("R.drawable.ic_launcher_background",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("R.drawable.ic_launcher_background",R.drawable.ic_launcher_background));
        citiesModelList.add(new CitiesModel("R.drawable.ic_launcher_background",R.drawable.ic_launcher_background));
        itemCountryAdappter = new CitiesAdapter(MainActivity.this, citiesModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(itemCountryAdappter);


    }
}