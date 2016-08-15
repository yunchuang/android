package com.example.yun.myapplication;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Yun on 2016/7/27.
 */
public class NotificationTestActivity extends Activity {
    static final int NOTIFICATION_ID = 0x123;
    NotificationManager nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void send(View source) {
        Intent intent = new Intent(NotificationTestActivity.this, MainActivity.class);
        // PendingIntent pi = PendingIntent.getActivities(NotificationTestActivity.this, 0, intent, 0);
        Notification notify = new Notification.Builder(this)
                .setAutoCancel(true)
                .setTicker("New Message")
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("A new Notification")
                .setContentText("Congratulations")
                .setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_LIGHTS)
                .build();
        nm.notify(NOTIFICATION_ID, notify);
    }


    public void del(View v) {
        nm.cancel(NOTIFICATION_ID);
    }
}


