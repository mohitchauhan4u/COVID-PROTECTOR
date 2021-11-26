package com.mohitchauhan4u.covidprotector;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class When_You_Are_Out_Of_Home_7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_when_you_are_out_of_home7);
    }
    public void openActivity(View v){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    }