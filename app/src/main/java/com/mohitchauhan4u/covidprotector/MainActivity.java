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
//When_You_Are_Out_Of_Home_1

//CARRY CLEANERS
// Antiviral wipes
// Alcohol pads
// Hand sanitizer
//(if you can find
//some)
//Keep them in your car so you
//have them handy, and carry
//them around when you go out.


//LATHER UP!
//Wash your hands for at least
//20 seconds with soap & water,
//especially after using
//the restroom.


//STAND
//T A L L
//Avoid
//leaning
//against
//walls,
//counters,
//& railings.
//Do not
//sit on
//floors
//or steps.


//HAND AWARENESS
//Limit the number
//of surfaces you touch.

//FACE OFF!
//We know it’s tough—
//but keep your hands off your
//face, eyes, mouth, & hair.

//KEEP EVERYTHING
//—CLEAN—
//Especially all high-touch surfaces
//in your home & car. Also, be sure to
//clean your hands before and after
//entering your home & car.
