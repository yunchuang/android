package com.example.yun.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

import com.example.yun.myapplication.R;

/**
 * Created by Yun on 2016/9/22.
 */
public class MyView extends View {
    private Paint mPaint;
    private float x = 100, y = 100;
    private BaseAnimation anim;
    private int mwidth, mheight;
    private float fx = 1, fy = 1;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(getResources().getColor(R.color.text_gray));
        canvas.drawCircle(x, y, 100, mPaint);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);          //抗锯齿
        mPaint.setColor(getResources().getColor(R.color.text_yellow));//画笔颜色
        mPaint.setStyle(Paint.Style.FILL);  //画笔风格
        mPaint.setTextSize(36);             //绘制文字大小，单位px
        mPaint.setStrokeWidth(5);           //画笔粗细
        anim = new BaseAnimation();
        anim.setDuration(20000);
    }

    public void startAnimation() {
        this.startAnimation(anim);
    }

    public class BaseAnimation extends Animation {
        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            float a = interpolatedTime * 10000 ;
            float b = interpolatedTime * 10000 ;
            float width=mwidth-200;
            float height=mheight-200;

            if ((int) (a / (width)) % 2 == 0) {
                x = a % width+100;
            } else {
                x=width-a%width+100;
            }
            if ((int) (b / (height)) % 2 == 0) {
                y = b % height+100;
            } else {
                y=height-a%height+100;
            }
            postInvalidate();
        }
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int height = getDefaultSize(getSuggestedMinimumHeight(),
                heightMeasureSpec);
        int width = getDefaultSize(getSuggestedMinimumWidth(), widthMeasureSpec);
        mheight = height;
        mwidth = width;
        int min = Math.min(width, height);
        setMeasuredDimension(width, height);

    }

}
