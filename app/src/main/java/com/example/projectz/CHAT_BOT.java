package com.example.projectz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CHAT_BOT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat__bot);
        WebView helpView = (WebView)findViewById(R.id.webview);
        helpView.getSettings().setJavaScriptEnabled(true);
        helpView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {

            }
        });
        helpView.loadUrl("file:///android_asset/chatbot.html");
    }
}
