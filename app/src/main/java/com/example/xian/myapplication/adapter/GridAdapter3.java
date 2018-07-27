package com.example.xian.myapplication.adapter;

import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xian.myapplication.R;
import com.example.xian.myapplication.model.AppInfo;
import com.example.xian.myapplication.model.ImageInfo;

import java.util.List;

/**
 * Name: GridAdapter2
 *
 * @Author: xian
 * Comment: //TODO
 * Date: 2018-07-26 11:38
 */
public class GridAdapter3 extends BaseAdapter {

    private Context context;
    private List<ImageInfo> ImageInfoList;
    public GridAdapter3(Context context, List<ImageInfo>ImageInfoList)
    {
        this.ImageInfoList=ImageInfoList;
        this.context=context;
    }
    @Override
    public int getCount() {
        return ImageInfoList.size();
    }

    @Override
    public Object getItem(int i) {
        return ImageInfoList.get(i);
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
            holder.imageView=(ImageView)view.findViewById(R.id.img_appIcon);
            holder.textView=(TextView)view.findViewById(R.id.tv_appName);
            view.setTag(holder);
        }
        else
        {
            holder=(ViewHolder)view.getTag();

        }
        ImageInfo imageInfo=ImageInfoList.get(i);
        holder.textView.setText(imageInfo.getText());

        if(imageInfo.getBitmap()==null)
        {
            holder.imageView.setImageResource(R.mipmap.ic_launcher);
        }
        else
        {
            holder.imageView.setImageBitmap(imageInfo.getBitmap());

        }
        return view;
    }
    public class ViewHolder
    {
        ImageView imageView;
        TextView textView;

    }
}
