package com.yutao.myutil.uitl;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.WindowManager;

public class StatusBarUtil {

    /**
     * 实现透明状态栏
     * @param activity 要实现透明状态栏的Activity
     */
    private void setImmersionStatus(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            // 透明状态栏
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            // 透明导航栏
//			getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
    }

}
