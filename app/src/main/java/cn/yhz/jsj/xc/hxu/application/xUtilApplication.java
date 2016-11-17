package cn.yhz.jsj.xc.hxu.application;

import android.app.Application;

import org.xutils.x;

/**
 * Simple to Introduction
 *
 * @Description: [一句话描述该类的功能]
 * @Author: 原海忠
 * @CreateDate: 2016/11/16
 * @Version: [v1.0]
 */
public class xUtilApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}