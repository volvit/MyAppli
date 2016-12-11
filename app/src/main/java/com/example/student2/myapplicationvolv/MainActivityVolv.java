package com.example.student2.myapplicationvolv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityVolv extends AppCompatActivity {

    TrueFalse arr [] = {
        new TrueFalse(" Небо голубое? ",true),
        new TrueFalse(" Обама - президент? ",true),
        new TrueFalse(" Сейчас лето? ",false),
        new TrueFalse(" Земля - 3 по счету? ",true),
        new TrueFalse(" Последний вопрос? ",true)

    };

    int pos = 0;
    boolean IsClick = false;

    TextView tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_volv);

        tw = (TextView)findViewById(R.id.tw);
        tw.setText(arr[0].getQuestion());
        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(arr[pos].isAnswer()){
                    Toast.makeText(MainActivityVolv.this,
                            R.string.toastText2,
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivityVolv.this,
                            R.string.toastText1,
                            Toast.LENGTH_SHORT).show();

                }
            }
        });

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("Log","Ответьте на вопрос");

                if(arr[pos].isAnswer()){
                    Toast.makeText(MainActivityVolv.this,
                            R.string.toastText1,
                            Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivityVolv.this,
                            R.string.toastText2,
                            Toast.LENGTH_SHORT).show();

                }

            }
        });

        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pos--;
                tw.setText(arr[pos].getQuestion());
            }
        });

        Button btnPrev = (Button) findViewById(R.id.btnPrev);
        btnPrev.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                pos++;
                tw.setText(arr[pos].getQuestion());
            }
        });

        Button btnasw = (Button) findViewById(R.id.btnasw);
        btnasw.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent i= new Intent (MainActivityVolv.this, SecondActivity.class);
                                          i.putExtra("KEY_Q",arr[pos].getQuestion());
                                          i.putExtra("KEY_A",arr[pos].isAnswer());
                                          startActivityForResult(i,0);
                                      }
                                  });


    }
}