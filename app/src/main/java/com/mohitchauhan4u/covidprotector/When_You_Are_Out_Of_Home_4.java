package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class When_You_Are_Out_Of_Home_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_when_you_are_out_of_home4);
    }
    public void openActivity(View v){
        Intent intent=new Intent(this,When_You_Are_Out_Of_Home_5.class);
        startActivity(intent);
    }
}