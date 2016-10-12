package com.example.yun.myapplication;

import android.app.Activity;
import android.os.Bundle;

import com.example.yun.view.MyView;

/**
 * Created by Yun on 2016/9/22.
 */
public class DrawActivity extends Activity{
    private MyView myview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);
        myview=(MyView)findViewById(R.id.myview);
        myview.startAnimation();
    }
}
