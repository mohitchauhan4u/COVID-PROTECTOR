package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class About_Covid extends AppCompatActivity {
    ListView listView;
    String[] arr={"What is COVID-19?","How does the virus spreads?",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_covid);
        CustomAdapter ad = new CustomAdapter(this, R.layout.custom_laytout, arr);
        listView.setAdapter(ad);
    }
}