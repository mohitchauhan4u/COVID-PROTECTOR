package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity{
    ListView listView;
    String[] arr={"Prevent the spread of COVID-19","Check if you have COVID-19 Symptoms","Precautions to take when you are out of home","About COVID-19"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        /*using built in array adapter
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,arr);
        listView.setAdapter(ad);*/

    //using custom adapter
        CustomAdapter ad=new CustomAdapter(this,R.layout.custom_laytout,arr);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent=new Intent(MainActivity.this,prevent_spread_1.class);
                    startActivity(intent);
                }else if(position==1){
//                    Intent intent=new Intent(MainActivity.this,prevent_spread_1.class);
//                    startActivity(intent);
                }else if(position==2){
                    Intent intent=new Intent(MainActivity.this,When_You_Are_Out_Of_Home_1.class);
                    startActivity(intent);
                }else if(position==3){
                    Intent intent=new Intent(MainActivity.this,About_Covid.class);
                    startActivity(intent);
                }
            }
        });
    }
}
