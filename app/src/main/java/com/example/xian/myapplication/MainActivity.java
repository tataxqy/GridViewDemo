package com.example.xian.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1,button2,button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        button1=(Button) findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.button1:
            {
                //跳转到ExampleActivity
                Intent intent =new Intent(MainActivity.this,ExampleActivity.class);
                startActivity(intent);
                break;

            }
            case R.id.button2:
            {
                Intent intent =new Intent(MainActivity.this,ExampleActivity2.class);
                startActivity(intent);
                break;
            }
            case R.id.button3:
            {
                Intent intent =new Intent(MainActivity.this,ExampleActivity3.class);
                startActivity(intent);
                break;
            }

        }
    }
}
