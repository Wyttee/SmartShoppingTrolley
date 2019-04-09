package com.inducesmile.androidpayexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ccv extends Activity{

    Button cash_button;
        @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.ccv);


}     public void onClick(View v){

        if(v.getId() == R.id.scan_btn) {
            Intent intent = new Intent(ccv.this, thankyou.class);
            startActivity(intent);
        }
    }}