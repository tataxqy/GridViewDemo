package com.example.xian.myapplication.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xian.myapplication.R;
import com.example.xian.myapplication.model.AppInfo;

import java.util.List;

/**
 * Name: GridAdapter2
 *
 * @Author: xian
 * Comment: //TODO
 * Date: 2018-07-26 11:38
 */
public class GridAdapter2 extends BaseAdapter {

    private Context context;
    private List<AppInfo> appInfoList;
    public GridAdapter2(Context context,List<AppInfo>appInfoList)
    {
        this.appInfoList=appInfoList;
        this.context=context;
    }
    @Override
    public int getCount() {
        return appInfoList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null)
        {
            view=View.inflate(context, R.layout.item_gridview2,null);
            holder=new ViewHolder();
            holder.img_appIcon=(ImageView)view.findViewById(R.id.img_appIcon);
            holder.tv_appName=(TextView)view.findViewById(R.id.tv_appName);
            view.setTag(holder);
        }
        else
        {
            holder=(ViewHolder)view.getTag();

        }
        AppInfo appInfo=appInfoList.get(i);
        holder.img_appIcon.setImageDrawable(appInfo.getAppIcon());
        holder.tv_appName.setText(appInfo.getAppName()+" "+appInfo.getVersionName());
        return view;
    }
    public class ViewHolder
    {
        ImageView img_appIcon;
        TextView tv_appName;

    }
}
