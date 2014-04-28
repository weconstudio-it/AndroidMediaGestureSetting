package com.simplec.phonegap.plugins.videosettings;

import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.os.Build;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaActivity;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.Callback;


public class AndroidMediaGestureSetting extends CordovaPlugin {

    private static final String LOG_TAG = "AndroidMediaGestureSetting";


    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1)
        	webView.getSettings().setMediaPlaybackRequiresUserGesture(false);

        Log.d(LOG_TAG, "setMediaPlaybackRequiresUserGesture: FALSE 123");

    }
}