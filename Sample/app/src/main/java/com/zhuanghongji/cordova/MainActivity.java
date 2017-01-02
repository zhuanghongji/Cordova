package com.zhuanghongji.cordova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.cordova.CordovaActivity;

public class MainActivity extends CordovaActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        // enable Cordova apps to be started in the background
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.getBoolean("cdvStartInBackground", false)) {
            moveTaskToBack(true);
        }

//        // Set by <content src="index.html" /> in config.xml
//        loadUrl(launchUrl);

        String cameraAsset = "file:///android_asset/test/camera/index.html";
        String cameraHttp = "https://github.com/zhuanghongji/Cordova/blob/master/Sample/app/src/main/assets/test/camera/";
        loadUrl(cameraAsset);
    }
}
