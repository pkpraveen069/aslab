package com.example.ex8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    String lat,long1;
    WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 ); Bundle
                b=getIntent().getExtras();
        lat=b.getString( "e1" );
        long1=b.getString( "e2" );
        w1=(WebView)findViewById( R.id.w1 );
        w1.setWebViewClient( new WebViewClient() );
        w1.getSettings().setJavaScriptEnabled( true );
        String url="https://www.google.com/maps/search/?api=1&query="+lat+","+long1;
        w1.loadUrl(url);
    }
}