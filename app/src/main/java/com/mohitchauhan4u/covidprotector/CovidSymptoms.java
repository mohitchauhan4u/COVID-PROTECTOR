package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CovidSymptoms extends AppCompatActivity {
    private final String[] questions = {"1.Fever", "2.Cough", "3.Loss of smell and/or taste", "4.Shortness of breath", "5.Fatigue","6.Aches and Pains"};
    private int symptoms = 0;
    Button yes;
    Button no;
    TextView question;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_symptoms);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question = findViewById(R.id.symptoms);
        question.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    symptoms++;
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        status(symptoms);
                    }
                } else {
                    Toast.makeText(CovidSymptoms.this, "Go back to check again", Toast.LENGTH_SHORT).show();
                }
            }


        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        status(symptoms);
                    }
                } else {
                    Toast.makeText(CovidSymptoms.this, "Go back to check again", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

    public void status(int symptoms) {
        TextView stat = findViewById(R.id.status);
        if(symptoms==0){
            stat.setText("Congratulations! \nYou have no symptom of COVID-19");
        }else if (symptoms == 1) {
            stat.setText("You have only "+symptoms+" symptom which can be flu or any other Allergic symptom.\n Take Care of Yourself");
        } else if (symptoms <= 3) {
            stat.setText("You have "+symptoms+" common symptoms of COVID-19 as well as flu\nYou need to have COVID-19 test and self isolation");
        } else {
            stat.setText("You have "+symptoms+" most common symptoms of COVID-19\nYou need to have COVID-19 test, self isolation and consulting a doctor");
        }
    }

}