package com.inducesmile.androidpayexample;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.zxing.Result;

import me.dm7.barcodescanner.zxing.ZXingScannerView;


/**
 * Created by ASMA on 08/03/18.
 */


public class scan extends AppCompatActivity implements ZXingScannerView.ResultHandler {
    private ZXingScannerView mScannerView;


    private Gson gson;

    private int cartProductNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan);

        mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
        setContentView(mScannerView);
    }


    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this); // Register ourselves as a handler for com.inducesmile.androidpayexample.scan results.
        mScannerView.startCamera();          // Start camera on resume
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(final Result prefs) {
        // Do something with the result here
        Log.v("TAG", prefs.getText()); // Prints com.inducesmile.androidpayexample.scan results
        Log.v("TAG", prefs.getBarcodeFormat().toString()); // Prints the com.inducesmile.androidpayexample.scan format (qrcode, pdf417 etc.)



        AlertDialog.Builder builder = new AlertDialog.Builder(this);


        builder.setTitle("Scan Result");
        builder.setMessage(prefs.getText())

                .setCancelable(false)
                .setPositiveButton("continue shopping ", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        Intent intent = new Intent(scan.this, ShoppingActivity.class);
                   startActivity(intent);

                    }
                })
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert1 = builder.create();
        alert1.show();

        // If you would like to resume scanning, call this method below:
        mScannerView.resumeCameraPreview(this);



    }}




