package com.wolf.android.fruitvalestation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDalyCityTimes(View view) {
        Intent i = new Intent(this, DalyCityActivity.class);
        startActivity(i);
    }

    public void openDublinPleasantonTimes(View view) {
        Intent i = new Intent(this, DublinPleasantonActivity.class);
        startActivity(i);
    }
    public void openRichmondTimes(View view){
        Intent i = new Intent( this, RichmondActivity.class);
        startActivity(i);
    }
    public void openWarmSpringsTimes(View view){
        Intent i = new Intent ( this, WarmSpringActivity.class);
        startActivity(i);
    }
}
