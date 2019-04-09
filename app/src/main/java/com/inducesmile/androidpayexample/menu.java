package com.inducesmile.androidpayexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class menu extends AppCompatActivity {


    Button btn1 ,btn2,btn3,btn4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        btn1 = (Button)findViewById(R.id.scan_btn);
        btn2 = (Button)findViewById(R.id.btn_profile);
        btn3 = (Button)findViewById(R.id.button12);
        btn4 = (Button)findViewById(R.id.button13);
    }

    public void onClick(View v){

        if(v.getId() == R.id.scan_btn){
            Intent intent = new Intent(menu.this, scan.class);
            startActivity(intent);

        }else if(v.getId() == R.id.btn_profile){
            Intent intent = new Intent(menu.this, myprofile.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button12){
            Intent intent = new Intent(menu.this, CheckoutActivity.class);
            startActivity(intent);
        }
        else if(v.getId() == R.id.button13){
            Intent intent = new Intent(menu.this, SearchProduct.class);
            startActivity(intent);
        }
    }

}



