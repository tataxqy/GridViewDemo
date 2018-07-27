package com.example.xian.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: ExampleActivity
 *
 * @Author: xian
 * Comment: //TODO
 * Date: 2018-07-25 15:12
 */
public class ExampleActivity extends Activity{
    private GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example1);
        gridView=(GridView)findViewById(R.id.gridview);
        List<String> strList=new ArrayList<String>();
        for(int i=0;i<12;i++)
        {
            strList.add("我只是一只土波许"+i);

        }
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.item_gridview1,strList);
        gridView.setAdapter(arrayAdapter);
    }
}
