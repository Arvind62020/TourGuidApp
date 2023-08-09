package com.example.karnatakatourguidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.karnatakatourguidapp.webviewpack.webtransfer;

public class Detailsshow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailsshow);




        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key_text");

        /* String links= intent.getStringExtra("message_key_link");*/

        //Image on screen--------------------------------------

        ImageView imageView;
        imageView = findViewById(R.id.image_view);
        Bundle bundle = getIntent().getExtras();
        int message_key_image = bundle.getInt("message_key_image");

        imageView.setImageResource(message_key_image);
        imageView.setVisibility(View.VISIBLE);

        //location of restaurants on screen ----------------------------------------
        String locations= intent.getStringExtra("message_key_location");
        TextView numbers = (TextView)findViewById(R.id.restaurant);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Uri gmmIntentUri = Uri.parse("geo:"+locations+"?q=restaurants");
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                startActivity(mapIntent);
                Intent intent = new Intent(Detailsshow.this, webtransfer.class);
                intent.putExtra("message_key_location3",locations);
                intent.putExtra("message_key_data","restaurant");
                startActivity(intent);

            }
        });


        //location on screen ----------------------------------------
        String locations1= intent.getStringExtra("message_key_location");
        TextView numbers1 = (TextView)findViewById(R.id.location);
        numbers1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Uri gmmIntentUri = Uri.parse("geo:"+locations1);
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                startActivity(mapIntent);
                Intent intent = new Intent(Detailsshow.this, webtransfer.class);
                intent.putExtra("message_key_location1",locations1);
                intent.putExtra("message_key_data","");
                startActivity(intent);

            }
        });

        //location of hospital on screen ----------------------------------------
        String locations2= intent.getStringExtra("message_key_location");
        TextView numbers2 = (TextView)findViewById(R.id.hospital);
        numbers2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Uri gmmIntentUri = Uri.parse("geo:"+locations2+"?q=railway");
                // now by putExtra method put the value in key, value pair key is
                // message_key by this key we will receive the value, and put the string
                Intent intent = new Intent(Detailsshow.this, webtransfer.class);
                intent.putExtra("message_key_location2",locations2);
                intent.putExtra("message_key_data","hospital");


                startActivity(intent);


            }
        });




        //location of railway   on screen ----------------------------------------
        String locations4= intent.getStringExtra("message_key_location");
        TextView numbers4 = (TextView)findViewById(R.id.railway);
        numbers4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Uri gmmIntentUri = Uri.parse("geo:"+locations3+"?q=railway");
//                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
//                mapIntent.setPackage("com.google.android.apps.maps");
//                startActivity(mapIntent);
                Intent intent = new Intent(Detailsshow.this, webtransfer.class);
                intent.putExtra("message_key_location4",locations4);
                intent.putExtra("message_key_data","railway");


                startActivity(intent);


            }
        });



        //browser search-----------------------------------------------------
        String url = intent.getStringExtra("message_key_link");



        TextView number2 = (TextView)findViewById(R.id.more_detail);
        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent i = new Intent(Intent.ACTION_VIEW);
//                i.setData(Uri.parse(url));
//                startActivity(i);
                Intent intent = new Intent(Detailsshow.this, webtransfer.class);
                intent.putExtra("message_key_location5",url);
                intent.putExtra("message_key_data","");
                startActivity(intent);


            }
        });

        //text view----------------------------------------------------------
        TextView quantityTextView = (TextView) findViewById(R.id.text);
        quantityTextView.setText("" + str);
    }
}