package com.example.yun.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Yun on 2016/9/22.
 */
public class ToastActivity extends Activity {
    private Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Toast Test", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL , 0, 0);  //设置显示位置
                TextView tv = (TextView) toast.getView().findViewById(android.R.id.message);
                tv.setTextColor(Color.YELLOW);     //设置字体颜色
                toast.show();

            }
        });
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Toast Test", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.BOTTOM , 0, 0);  //设置显示位置
                LinearLayout layout = (LinearLayout) toast.getView();
                layout.setBackgroundColor(Color.BLUE);
                ImageView image = new ImageView(getApplicationContext());
                image.setImageResource(R.drawable.ic_launcher);
                layout.addView(image, 0);
                TextView tv = (TextView) toast.getView().findViewById(android.R.id.message);
                tv.setTextColor(Color.YELLOW);     //设置字体颜色
                toast.show();


            }
        });
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=getLayoutInflater();
                View view=inflater.inflate(R.layout.view_toast_custom,(ViewGroup)findViewById(R.id.ll));
                ImageView img_logo=(ImageView)view.findViewById(R.id.img_logo);
                TextView tv_msg=(TextView) view.findViewById(R.id.tv_msg);
                tv_msg.setText("Hello");
                Toast toast=new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER,0,0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(view);
                toast.show();


            }
        });
    }
}
