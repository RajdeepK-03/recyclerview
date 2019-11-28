package com.example.a27novandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCountryList;
    private List<Country> countryList;

    private Recyclerviewexample demoAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView()
    {
        populateData();
        rvCountryList=findViewById(R.id.rv_Students);
        RecyclerView.LayoutManager mL = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvCountryList.setLayoutManager(mL);
        rvCountryList.setAdapter(demoAdapter);
    }
    private void populateData(){
        countryList=new ArrayList<>();
        countryList.add(new Country("USA",R.drawable.al));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.es));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Australia",R.drawable.au));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("Afganistan",R.drawable.af));
        countryList.add(new Country("Italy",R.drawable.it));
        countryList.add(new Country("German",R.drawable.ge));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.al));
        countryList.add(new Country("India",R.drawable.in));
        countryList.add(new Country("USA",R.drawable.es));
        countryList.add(new Country("Canada",R.drawable.ca));
        countryList.add(new Country("Australia",R.drawable.au));
        countryList.add(new Country("Pakistan",R.drawable.pk));
        countryList.add(new Country("Afganistan",R.drawable.af));
        countryList.add(new Country("Italy",R.drawable.it));
        countryList.add(new Country("German",R.drawable.ge));
        countryList.add(new Country("India",R.drawable.in));
    }
}



