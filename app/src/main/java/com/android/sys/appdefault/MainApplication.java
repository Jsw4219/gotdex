package com.android.sys.appdefault;

import android.app.Application;

/**
 * 作者: Sollyu
 * 时间: 16/10/23
 * 联系: sollyu@qq.com
 * 说明:
 */
public class MainApplication extends Application {

    private static MainApplication instance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        MainApplication.instance = this;
    }

    public synchronized static MainApplication getInstance() {
        return instance;
    }

    /**
     * @return 为了检查XPOSED是否工作
     */
    public boolean isXposedWork() {
        return false;
    }


}
