package com.kr.countrysidepartner;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        Handler hd = new Handler();
        hd.postDelayed(new splashhHandler(), 2000);


    }

    private class splashhHandler implements Runnable{

        public void run(){

            startActivity(new Intent(getApplication(), MainActivity.class));
            Splash2Activity.this.finish();
        }
    }
}
