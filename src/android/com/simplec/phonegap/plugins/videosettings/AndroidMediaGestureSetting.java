package com.simplec.phonegap.plugins.videosettings;

import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.os.Build;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaPlugin;

public class AndroidMediaGestureSetting extends CordovaPlugin {

    private static final String LOG_TAG = "AndroidMediaGestureSetting";


    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1)
        	webView.getSettings().setMediaPlaybackRequiresUserGesture(false);

        
        
        webView.setOnKeyListener(new OnKeyListener() {
        	Log.d(LOG_TAG, "---------------------- cazzetti1");
            public boolean onKey(View v, int keyCode, KeyEvent event) {
            	Log.d(LOG_TAG, "---------------------- cazzetti2");
                if (keyCode == KeyEvent.KEYCODE_BACK && event.getAction() == KeyEvent.ACTION_UP) {
                	Log.d(LOG_TAG, "---------------------- cazzetti3");
                    // Do Here whatever you want 
                    return true;
                }
                return onKeyDown(keyCode, event); 
            } 
        });
        
        
        
        
        Log.d(LOG_TAG, "setMediaPlaybackRequiresUserGesture: FALSE 123");

    }
}