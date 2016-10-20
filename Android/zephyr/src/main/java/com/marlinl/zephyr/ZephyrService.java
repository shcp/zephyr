package com.marlinl.zephyr;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.support.annotation.Nullable;

/**
 * Created by MarlinL on 19/10/2016.
 */

public class ZephyrService extends Service {


    private final Messenger mMessenger;

    private final BroadcastSender mSender;

    public ZephyrService() {
        this.mMessenger = new Messenger(new ZephyrHandler());
        this.mSender = new BroadcastSender();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mMessenger.getBinder();
    }

    class BroadcastSender {

    }
}
