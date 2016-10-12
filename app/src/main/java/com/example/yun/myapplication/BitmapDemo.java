package com.example.yun.myapplication;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Yun on 2016/9/11.
 */
public class BitmapDemo extends Activity{
    static ByteArrayOutputStream byteOut=null;
    private Bitmap bitmap=null;
    private Button btn_cut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bitmapdemo);
        btn_cut=(Button)findViewById(R.id.btncut);
        btn_cut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(">>>aaa");
                captureScreen();
            }
        });

    }
    public void captureScreen(){
        Runnable action=new Runnable() {
            @Override
            public void run() {
                final View contentView=getWindow().getDecorView();
                try{

                    System.out.println(contentView.getHeight()+":"+contentView.getWidth());
                    bitmap=Bitmap.createBitmap(contentView.getWidth(),contentView.getHeight(),Bitmap.Config.ARGB_4444);
                    contentView.draw(new Canvas(bitmap));
                    ByteArrayOutputStream byteOut=new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.JPEG,100,byteOut);
                    System.out.println("Success");
                   //savePic(bitmap,"");

                }catch (Exception e){}
                finally {
                    try {
                        if(null!=byteOut){
                            byteOut.close();
                        }
                        if(null!=bitmap&&bitmap.isRecycled()){
                            bitmap.recycle();;
                            bitmap=null;
                        }

                    }catch (IOException e){}
                }
            }
        };
        try{
            action.run();
        }catch (Exception e){}

    }
}
