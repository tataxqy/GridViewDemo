package com.example.xian.myapplication;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.GridView;

import com.example.xian.myapplication.adapter.GridAdapter2;
import com.example.xian.myapplication.model.AppInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: ExampleActivity2
 *
 * @Author: xian
 * Comment: //TODO
 * Date: 2018-07-25 18:10
 */
public class ExampleActivity2 extends Activity {

    private GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example2);
        gridView=(GridView) findViewById(R.id.gridview);
        //传入适配器
        //this 是上下文
        GridAdapter2 gridAdapter2=new GridAdapter2(this,getAppList());
        gridView.setAdapter(gridAdapter2);
    }

    public List<AppInfo> getAppList()
    {
        List<AppInfo> appInfoList=new ArrayList<AppInfo>();
        PackageManager packageManager =getPackageManager();
        List<PackageInfo>installedPackages=packageManager.getInstalledPackages(0);

        for(int i=0;i<installedPackages.size();i++)
        {
            PackageInfo packageInfo=installedPackages.get(i);
            AppInfo appInfo=new AppInfo();
            appInfo.setAppName(packageInfo.applicationInfo.loadLabel(packageManager).toString());
            appInfo.setAppIcon(packageInfo.applicationInfo.loadIcon(packageManager));
            appInfo.setPackageName(packageInfo.packageName);
            appInfo.setVersionCode(packageInfo.versionCode);
            appInfo.setVersionName(packageInfo.versionName);
            if((packageInfo.applicationInfo.flags& ApplicationInfo.FLAG_SYSTEM)==0)
            {
                appInfoList.add(appInfo);
            }

        }

        return appInfoList;
    }


}
