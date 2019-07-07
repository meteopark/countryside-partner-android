package com.kr.countrysidepartner;
import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebSetting extends WebViewClient {

    @TargetApi(Build.VERSION_CODES.O)
    public WebView webSetting(WebView webView){

        WebView webView1 = webView;
        WebSettings webSettings = webView1.getSettings();

        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadsImagesAutomatically(true);
        webSettings.setJavaScriptCanOpenWindowsAutomatically(true);
        webSettings.setUseWideViewPort(true);
//        webSettings.setSafeBrowsingEnabled(false);
        webSettings.setGeolocationEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);


        return webView1;
    }
}
