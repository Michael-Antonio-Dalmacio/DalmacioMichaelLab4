package com.dalmacio.michael.dalmaciomichaellab4;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import static android.support.design.widget.Snackbar.*;

public class DalmacioMichaelLab4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dalmacio_michael_lab4);
        Log.d("4ITF", "onCreate has executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITF", "onStart has executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITF", "onResume has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITF", "onPause has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITF", "onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITF", "onRestart has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITF", "onDestroy has executed");
    }

    public void displayToast(View v){
        Toast.makeText(this, "Button is clicked",Toast.LENGTH_LONG).show();
    }

    public void displaySnackbar(View v){
        Snackbar.make(v,"Snackbar is displayed",Snackbar.LENGTH_LONG).show();
    }
}
