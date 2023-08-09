package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView numbers = (TextView)findViewById(R.id.picnic_spots);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,PicnicSpots.class);
                startActivity(numbersIntent);
            }
        });

        TextView number2 = (TextView)findViewById(R.id.hill_station);
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,HillStation.class);
                startActivity(numbersIntent);
            }
        });


        TextView number3 = (TextView)findViewById(R.id.resorts);
        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,Resorts.class);
                startActivity(numbersIntent);
            }
        });
        TextView number4 = (TextView)findViewById(R.id.dams);
        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,Dams.class);
                startActivity(numbersIntent);
            }
        });
        TextView number5 = (TextView)findViewById(R.id.historical_place);
        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,HistoricalPlaces.class);
                startActivity(numbersIntent);
            }
        });


        TextView number6 = (TextView)findViewById(R.id.temples);
        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this,HistoricalTemples.class);
                startActivity(numbersIntent);
            }
        });

        TextView number7 = (TextView)findViewById(R.id.nature_places);
        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, .class);
                startActivity(numbersIntent);
            }
        });

    }
}