package com.example.yun.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Yun on 2016/7/28.
 */
public class MyFragment extends Fragment {
    private String content;
    public MyFragment(String content){
        this.content=content;
    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fg_content,container,false);
        TextView txt=(TextView)view.findViewById(R.id.txt_content);
        txt.setText(content);
        return view;
    }
}
