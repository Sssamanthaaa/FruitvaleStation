package com.wolf.android.fruitvalestation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DalyCityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daly_city);

        ArrayList<String> trainTimes = new ArrayList<>();
        trainTimes.add("15 minutes");
        trainTimes.add("10 minutes");
        trainTimes.add("5 minutes");

        ListView dalyCityListView = findViewById(R.id.daly_city_listview);
        ArrayAdapter<String> dalyCityAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, trainTimes);
        dalyCityListView.setAdapter(dalyCityAdapter);

    }
}
