package com.thedyd.zizi;

import android.app.Application;
import android.content.Context;

/**
 * Created by Jeon Sung Yong on 2015-12-01.
 */
public class MyPhotoApplication extends Application {

    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this;

        //SystemClock.sleep(TimeUnit.SECONDS.toMillis(5));
    }

    public static Context getContext() {
        return mContext;
    }


}
