package com.deitel.tipcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        WebView googleWebView = (WebView) findViewById(R.id.webViewGoogle);
        googleWebView.loadUrl("https://www.google.com/");

    }
}
