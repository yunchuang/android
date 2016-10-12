package com.example.yun.myapplication;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;

import com.example.yun.util.CircleBar;

/**
 * Created by Yun on 2016/9/21.
 */
public class ProgressActivity extends Activity{
    private ImageView imageview;
    private AnimationDrawable ad;
    private CircleBar circleBar;
    private int type = 1;//页面类型
    //需要在handler里修改UI
    private Handler handler = new Handler() {
        public void handleMessage(android.os.Message msg) {
            if (type == 1) {
                circleBar.setProgress(270, 1);
                circleBar.setText(1000);
                circleBar.startCustomAnimation();
            } else if (type == 2) {
                circleBar.setProgress(180, 2);
                circleBar.setText(1500);
                circleBar.startCustomAnimation();
            } else if (type == 3) {
                circleBar.setProgress(360, 3);
                circleBar.startCustomAnimation();
            }
        };
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        imageview=(ImageView)findViewById(R.id.imageview);
        ad=(AnimationDrawable) imageview.getDrawable();
        imageview.postDelayed(new Runnable() {
            @Override
            public void run() {
                ad.start();
            }
        },100);
        circleBar = (CircleBar)findViewById(R.id.circle);

        circleBar.setProgress(280, 1);
        circleBar.setText(2000);
        circleBar.startCustomAnimation();//开启动画
        circleBar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (type == 1) {
                    type = 2;
                } else if (type == 2) {
                    type = 3;
                } else if (type == 3) {
                    type = 1;
                }
                Message msg = new Message();
                handler.sendMessage(msg);
            }
        });

    }
}
