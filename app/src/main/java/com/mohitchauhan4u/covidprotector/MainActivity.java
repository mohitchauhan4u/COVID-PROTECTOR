package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] arr={"Prevent the spread of COVID-19","Check if you have Covid-19 Symptoms","Precautions to take when you are out of home","About Covid-19"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,arr);
        listView.setAdapter(ad);
    }
}
