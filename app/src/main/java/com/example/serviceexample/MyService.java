package com.example.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    MediaPlayer mediaPlyer = null;
    public MyService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if(mediaPlyer != null) {
            mediaPlyer.release();
        }
        if(intent.getAction().equals("music1")) {
            mediaPlyer = MediaPlayer.create(this, R.raw.music1);
            mediaPlyer.start();
        }
        else if(intent.getAction().equals("music2")) {
            mediaPlyer = MediaPlayer.create(this, R.raw.music2);
            mediaPlyer.start();
        }
            return super.onStartCommand(intent, flags, startId);


    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        if(mediaPlyer != null) {
            mediaPlyer.release();
        }
        mediaPlyer = null;
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}