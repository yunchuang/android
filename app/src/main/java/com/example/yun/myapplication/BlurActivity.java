package com.example.yun.myapplication;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.yun.util.BlurBitmapUtil;

/**
 * Created by Yun on 2016/9/23.
 */
public class BlurActivity extends Activity {
    private ImageView blurimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blur);
        //
        blurimage=(ImageView)findViewById(R.id.blurimage);
       Bitmap initBitmap= BitmapFactory.decodeResource(getResources(),R.drawable.couresbackground);
        Bitmap blurBitmap= BlurBitmapUtil.blurBitmap(BlurActivity.this,initBitmap,25);
        blurimage.setImageBitmap(blurBitmap);

    }
}
