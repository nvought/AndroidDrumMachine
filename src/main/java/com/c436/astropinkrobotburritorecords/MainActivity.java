package com.c436.astropinkrobotburritorecords;

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
    public void viewAboutUs(View v) {
        Intent goTerms = new Intent(MainActivity.this, AboutUS.class);
        startActivity(goTerms);
    }
    public void viewDrumMachine(View v) {
        Intent goCourses = new Intent(MainActivity.this, DrumMachine.class);
        startActivity(goCourses);
    }
}
