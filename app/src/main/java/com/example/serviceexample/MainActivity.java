package com.example.serviceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickbutton1(View v){
        Intent intent = new Intent(this,MyService.class);
        intent.setAction("music1");
        startService(intent);

    }
    public void onClickbutton2(View v){
        Intent intent = new Intent(this,MyService.class);
        intent.setAction("music2");
        startService(intent);

    }
    public void onClickbutton3(View v){
        Intent intent = new Intent(this,MyService.class);
        stopService(intent);

    }

}