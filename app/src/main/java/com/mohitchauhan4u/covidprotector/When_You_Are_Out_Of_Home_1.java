package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class When_You_Are_Out_Of_Home_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_when_you_are_out_of_home1);
    }
    public void openActivity(View v){
        Intent intent=new Intent(this,When_You_Are_Out_Of_Home_2.class);
        startActivity(intent);
    }
}