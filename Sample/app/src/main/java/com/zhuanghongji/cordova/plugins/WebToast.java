package com.zhuanghongji.cordova.plugins;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;

import static android.media.CamcorderProfile.get;

/**
 * Created by zhuanghongji on 2017/1/3.
 */

public class WebToast extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Activity activity = cordova.getActivity();

        if ("showToast".equals(action)){
            String msg = args.getString(0);
            Toast.makeText(activity, msg, Toast.LENGTH_LONG).show();
            callbackContext.success();
            return true;
        }
        return false; // Returning false results in a "MethodNotFound" error.
    }

}
