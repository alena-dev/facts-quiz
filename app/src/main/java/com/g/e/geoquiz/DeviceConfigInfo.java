package com.g.e.geoquiz;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.widget.TextView;

public class DeviceConfigInfo {

    public static void showSdkVersion(TextView sdkVersionTextView, Context context){
        String sdkVersion = context.getResources().getString(R.string.sdk_version)
                +" "+String.valueOf(Build.VERSION.SDK_INT)
                +" "+Build.VERSION.CODENAME;
        sdkVersionTextView.setText(sdkVersion);

    }
}
