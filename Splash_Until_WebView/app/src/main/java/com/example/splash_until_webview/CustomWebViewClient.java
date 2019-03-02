package com.example.splash_until_webview;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class CustomWebViewClient extends WebViewClient
{
    private  String ShowOrHideWebViewInitialUse;

    private ProgressBar spinner;

    public CustomWebViewClient(String ShowOrHideWebViewInitialUse,ProgressBar spinner)
    {
        this.ShowOrHideWebViewInitialUse=ShowOrHideWebViewInitialUse;
        this.spinner = spinner;
    }

    @Override
    public void onPageStarted(WebView webview, String url, Bitmap favicon)
    {
        // only make it invisible the FIRST time the app is run
        if (ShowOrHideWebViewInitialUse.equals("show"))
        {
            webview.setVisibility(webview.INVISIBLE);
        }
    }

    @Override
    public void onPageFinished(WebView webview, String url)
    {
        ShowOrHideWebViewInitialUse= "hide";
        spinner.setVisibility(View.GONE);

        webview.setVisibility(webview.VISIBLE);
        super.onPageFinished(webview, url);
    }
}
