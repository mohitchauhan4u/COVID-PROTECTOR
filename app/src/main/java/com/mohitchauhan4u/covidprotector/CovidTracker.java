package com.mohitchauhan4u.covidprotector;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.mohitchauhan4u.covidprotector.api.ApiUtilities;
import com.mohitchauhan4u.covidprotector.api.CountryData;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CovidTracker extends AppCompatActivity {

    private TextView totalConfirmed,todayConfirmed,totalActive,totalRecovered,todayRecovered,totalDeath,todayDeath,totalTests,date;
    private PieChart pieChart;

    private List<CountryData> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_covid_tracker);

        list=new ArrayList<>();

        init();

        ApiUtilities.getApiInterface().getCountryData()
                .enqueue(new Callback<List<CountryData>>() {
                    @Override
                    public void onResponse(Call<List<CountryData>> call, Response<List<CountryData>> response) {
                        list.addAll(response.body());

                        for (int i=0;i<list.size();i++){
                            if(list.get(i).getCountry().equals("India")){
                                int confirm=Integer.parseInt(list.get(i).getCases());
                                int active=Integer.parseInt(list.get(i).getActive());
                                int recovered=Integer.parseInt(list.get(i).getRecovered());
                                int death=Integer.parseInt(list.get(i).getDeaths());
                                totalActive.setText(NumberFormat.getInstance().format(active));
                                totalDeath.setText(NumberFormat.getInstance().format(death));
                                totalRecovered.setText(NumberFormat.getInstance().format(recovered));
                                totalConfirmed.setText(NumberFormat.getInstance().format(confirm));

                                todayDeath.setText("+"+NumberFormat.getInstance().format(Integer.parseInt(list.get(i).getTodayDeaths())));
                                todayConfirmed.setText("+"+NumberFormat.getInstance().format(Integer.parseInt(list.get(i).getTodayCases())));
                                todayRecovered.setText("+"+NumberFormat.getInstance().format(Integer.parseInt(list.get(i).getTodayRecovered())));
                                totalTests.setText(NumberFormat.getInstance().format(Integer.parseInt(list.get(i).getTests())));

                                setText(list.get(i).getUpdated());

                                pieChart.addPieSlice(new PieModel("Confirm",confirm,getResources().getColor(R.color.yellow)));
                                pieChart.addPieSlice(new PieModel("Death",death,getResources().getColor(R.color.red_pie)));
                                pieChart.addPieSlice(new PieModel("Active",active,getResources().getColor(R.color.blue_pie)));
                                pieChart.addPieSlice(new PieModel("Recovered",recovered,getResources().getColor(R.color.green_pie)));
                                pieChart.startAnimation();
                            }
                        }
                    }

                    @Override
                    public void onFailure(Call<List<CountryData>> call, Throwable t) {

                        Toast.makeText(CovidTracker.this,"Error : "+t.getMessage(),Toast.LENGTH_SHORT);
                    }
                });


    }

    private void setText(String updated) {
        DateFormat format=new SimpleDateFormat("MMM dd,yyyy");
        long millisecond=Long.parseLong(updated);
        Calendar calendar=Calendar.getInstance();
        calendar.setTimeInMillis(millisecond);

        date.setText("Updated at "+format.format(calendar.getTime()));
    }

    private void init(){
        totalConfirmed=findViewById(R.id.totalConfirmed);
        todayConfirmed=findViewById(R.id.todayConfirmed);
        totalActive=findViewById(R.id.totalActive);
        totalRecovered=findViewById(R.id.totalRecovered);
        todayRecovered=findViewById(R.id.todayRecovered);
        totalDeath=findViewById(R.id.totalDeath);
        todayDeath=findViewById(R.id.todayDeath);
        totalTests=findViewById(R.id.totalTests);
        pieChart=findViewById(R.id.piechart);
        date=findViewById(R.id.date);
    }
}
