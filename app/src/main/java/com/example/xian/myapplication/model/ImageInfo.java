package com.example.xian.myapplication.model;

import android.graphics.Bitmap;

/**
 * Name: ImageInfo
 *
 * @Author: xian
 * Comment: //TODO
 * Date: 2018-07-26 15:41
 */
/**
 * 步骤
 * 1.建立成员
 * 2创建get和set方法
 * 3.创建Adapter
 **/
public class ImageInfo {
    //图片转成BITMAP塞进去
    //图片地址
    private String imagePath;
    private Bitmap bitmap;
    private String text;


    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
