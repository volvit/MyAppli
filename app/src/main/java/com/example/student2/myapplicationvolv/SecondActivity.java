package com.example.student2.myapplicationvolv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.student2.myapplicationvolv.R.id.tw;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = getIntent();
        boolean b = i.getBooleanExtra("KEY_A",false);
        String s = i.getStringExtra("KEY_Q");

        TextView tw;

     //   tw = (TextView)findViewById(tw);
     //   tw.setText();
        Button Look = (Button) findViewById(R.id.Look);
        Look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this,
                        "Вы подсмотрели",
                        Toast.LENGTH_LONG).show();
                if(true){
                    Toast.makeText(SecondActivity.this,
                            "Да",
                            Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(SecondActivity.this,
                            "Нет",
                            Toast.LENGTH_LONG).show();
                }
            }

        });{

        }


/*
        if(){

            Button btnback = (Button) findViewById(R.id.btnback);
            btnback.setOnClickListener(new View.OnClickListener() {

            }


        }
    */

    }
}
    //getIntent(MainActivityVolv.);