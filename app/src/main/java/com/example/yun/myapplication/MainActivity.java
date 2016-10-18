package com.example.yun.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button notificationb;
    private Button activityloadb;
    private Button fragmentb;
    private Button imagetestb;
    private Button bitmapb;
    private Button progress,popup,toast,draw,blur;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationb = (Button) findViewById(R.id.notification);
        notificationb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NotificationTestActivity.class);
                startActivity(intent);
            }
        });
        activityloadb = (Button) findViewById(R.id.activityload);
        activityloadb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, StandardTest.class);
                startActivity(intent);
            }
        });
        fragmentb = (Button) findViewById(R.id.fragment);
        fragmentb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FragmentTestActivity.class);
                startActivity(intent);
            }
        });
        imagetestb = (Button) findViewById(R.id.imagetest);
        imagetestb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ImageTestActivity.class);
                startActivity(intent);
            }
        });
        bitmapb = (Button) findViewById(R.id.bitmapb);
        bitmapb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BitmapDemo.class);
                startActivity(intent);
            }
        });
        progress = (Button) findViewById(R.id.progress);
        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ProgressActivity.class);
                startActivity(intent);
            }
        });
        toast = (Button) findViewById(R.id.toast);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ToastActivity.class);
                startActivity(intent);
            }
        });
        popup = (Button) findViewById(R.id.popup);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, PopupWindowActivity.class);

                startActivity(intent);
            }
        });
        draw = (Button) findViewById(R.id.draw);
        draw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, DrawActivity.class);
                startActivity(intent);
            }
        });
        blur = (Button) findViewById(R.id.blur);
        blur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, BlurActivity.class);

                startActivity(intent);
            }
        });


    }
}
