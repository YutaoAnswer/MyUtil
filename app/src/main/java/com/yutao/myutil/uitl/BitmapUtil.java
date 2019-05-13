package com.yutao.myutil.uitl;

import android.graphics.Bitmap;
import android.graphics.Matrix;

public class BitmapUtil {

    /**
     * Bitmap 重采样
     * @param bp 原有Bitmap
     * @param newWidth 新尺寸宽度
     * @param newHeight 新尺寸高度
     * @return 重采样bitmap
     */
    public Bitmap getResizeBitmap(Bitmap bp, int newWidth, int newHeight) {
        int width = bp.getWidth();
        int height = bp.getHeight();
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeigth = ((float) newHeight) / height;
        //CREATE A MATRIX FOR THE MANIPULATION
        Matrix matrix = new Matrix();
        //RESIZE THE BITMAP
        matrix.postScale(scaleWidth, scaleHeigth);

        //RECREATE THE NEW BITMAP
        Bitmap resizeBitmap = Bitmap.createBitmap(bp, 0, 0, width, height, matrix, false);
        bp.recycle();

        return resizeBitmap;
    }
}
