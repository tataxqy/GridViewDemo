package com.example.xian.myapplication.model;

import android.graphics.drawable.Drawable;

/**
 * Name: AppInfo
 *
 * @Author: xian
 * Comment: //TODO
 * Date: 2018-07-25 18:16
 */
public class AppInfo {

    private String appName;
    private String packageName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    public Drawable getAppIcon() {
        return appIcon;
    }

    public void setAppIcon(Drawable appIcon) {
        this.appIcon = appIcon;
    }

    private String versionName;
    private int versionCode;
    private Drawable appIcon;

}
