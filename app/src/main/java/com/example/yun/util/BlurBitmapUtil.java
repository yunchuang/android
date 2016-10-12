package com.example.yun.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsic;
import android.renderscript.ScriptIntrinsicBlur;

/**
 * Created by Yun on 2016/9/23.
 */
public class BlurBitmapUtil {
    private static final float BITMAP_SCALE = 0.6f;

    public static Bitmap blurBitmap(Context context, Bitmap bitmap, float blurRadius) {
        int width = Math.round(bitmap.getWidth() * BITMAP_SCALE);
        int height = Math.round(bitmap.getHeight() * BITMAP_SCALE);
        Bitmap inputBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
        Bitmap outputBitmap = Bitmap.createBitmap(inputBitmap);
        RenderScript rs = RenderScript.create(context);
        ScriptIntrinsicBlur blurScript = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));

        Allocation tmpIn = Allocation.createFromBitmap(rs, inputBitmap);
        Allocation tmpOut = Allocation.createFromBitmap(rs, outputBitmap);
        System.out.println(">>>>>>" + blurRadius);
        blurScript.setRadius(blurRadius);
        blurScript.setInput(tmpIn);
        blurScript.forEach(tmpOut);
        tmpOut.copyTo(outputBitmap);
        return outputBitmap;
    }
}
