package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prevent_spread_6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prevent_spread6);
    }
    public void openActivity(View v){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}