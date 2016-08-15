package com.example.yun.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Yun on 2016/7/27.
 */
public class StandardTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout=new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        this.setContentView(layout);
        TextView tv=new TextView(this);
        tv.setText("Activity is："+this.toString()+"\n"+"TaskID is"+this.getTaskId());
        Button button=new Button(this);
        button.setText("Start StandardTest");
        layout.addView(tv);
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(StandardTest.this,StandardTest.class);
                startActivity(intent);
            }
        });
    }
}
