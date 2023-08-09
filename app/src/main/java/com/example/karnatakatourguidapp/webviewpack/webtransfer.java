package com.example.karnatakatourguidapp.webviewpack;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.karnatakatourguidapp.R;

public class webtransfer extends AppCompatActivity {
    WebView webView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webtransfer);
        Intent intent = getIntent();
        String locations1 = intent.getStringExtra("message_key_location1");
        String locations2 = intent.getStringExtra("message_key_location2");
        String locations = intent.getStringExtra("message_key_location3");
        String locations4 = intent.getStringExtra("message_key_location4");
        String locations5 = intent.getStringExtra("message_key_location5");
        if(locations2!=null) {

            String data = intent.getStringExtra("message_key_data");
            //  http://www.google.com/maps/place/lat,lng
            // https://www.google.com/maps/search/restaurants/
            //https://www.google.com/maps/place/"+locations2+"/q=railway
            //https://www.google.com/maps/search/pizza/@41.089988,-81.542901,12z
            Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/" + data + "/@" + locations2 + ",12z");
            webView = findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(String.valueOf(gmmIntentUri));
        }
        else if(locations1!=null) {



            Uri gmmIntentUri = Uri.parse("https://maps.google.com/?q= "+ locations1);
            webView = findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(String.valueOf(gmmIntentUri));
        }
        else if(locations!=null) {

            String data = intent.getStringExtra("message_key_data");
            //  http://www.google.com/maps/place/lat,lng
            // https://www.google.com/maps/search/restaurants/
            //https://www.google.com/maps/place/"+locations2+"/q=railway
            //https://www.google.com/maps/search/pizza/@41.089988,-81.542901,12z
            Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/" + data + "/@" + locations + ",12z");
            webView = findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(String.valueOf(gmmIntentUri));
        }
        else if(locations4!=null) {

            String data = intent.getStringExtra("message_key_data");
            //  http://www.google.com/maps/place/lat,lng
            // https://www.google.com/maps/search/restaurants/
            //https://www.google.com/maps/place/"+locations2+"/q=railway
            //https://www.google.com/maps/search/pizza/@41.089988,-81.542901,12z
            Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/" + data + "/@" + locations4 + ",12z");
            webView = findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(String.valueOf(gmmIntentUri));
        }
        else if(locations5!=null) {

            //String data = intent.getStringExtra("message_key_data");
            //  http://www.google.com/maps/place/lat,lng
            // https://www.google.com/maps/search/restaurants/
            //https://www.google.com/maps/place/"+locations2+"/q=railway
            //https://www.google.com/maps/search/pizza/@41.089988,-81.542901,12z
            //Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/search/" + data + "/@" + locations2 + ",12z");
            webView = findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient());
            webView.loadUrl(String.valueOf(locations5));
        }


    }
}