package com.example.yun.myapplication;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends ActionBarActivity {

    private Button notificationb;
    private Button activityloadb;
    private Button fragmentb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notificationb=(Button)findViewById(R.id.notification);
        notificationb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, NotificationTestActivity.class);
                startActivity(intent);
            }
        });
        activityloadb=(Button)findViewById(R.id.activityload);
        activityloadb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,StandardTest.class);
                startActivity(intent);
            }
        });
        fragmentb=(Button)findViewById(R.id.fragment);
        fragmentb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,FragmentTestActivity.class);
                startActivity(intent);
            }
        });


    }
}
