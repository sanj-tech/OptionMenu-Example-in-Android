package com.jsstech.menuexampledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread t=new Thread(){
            @Override
            public void run() {
               try{
                   sleep(6000);

               }catch(Exception e){
                   e.printStackTrace();

               }finally {
                   Intent intent=new Intent(SplashActivity.this,MainActivity.class);
                   startActivity(intent);

               }

            }

        };
        t.start();

    }
    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}