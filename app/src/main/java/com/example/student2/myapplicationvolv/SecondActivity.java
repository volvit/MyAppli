package com.example.student2.myapplicationvolv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        boolean b = i.getBooleanExtra("KEY_A",false);
        String s = i.getStringExtra("KEY_Q");

//getIntent()

    }
}
