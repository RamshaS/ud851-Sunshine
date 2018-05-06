package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    TextView mTVWeatherDetailData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
       mTVWeatherDetailData =  (TextView) findViewById(R.id.tv_weather_detail);


        // Completed (2) Display the weather forecast that was passed from MainActivity
        Intent detailIntent = getIntent();
        if(detailIntent != null){
            if(detailIntent.hasExtra(MainActivity.WEATHER_DETAIL_TAG)){
                mTVWeatherDetailData.setText(detailIntent.getStringExtra(MainActivity.WEATHER_DETAIL_TAG));
            }
        }
    }
}