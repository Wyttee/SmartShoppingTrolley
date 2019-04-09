package com.inducesmile.androidpayexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


/**
 * Created by ASMA on 20/02/18.
 */

public class welcome extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);


    final Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
        public void run() {

            Intent vInHome = new Intent(welcome.this,login.class);

            welcome.this.startActivity(vInHome);
            welcome.this.finish();
        }
    }
                , 5000);
        }}