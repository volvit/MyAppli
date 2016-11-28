package com.example.student2.myapplicationvolv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityVolv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_volv);

        Button btn1 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.e("Log","Hello ...world");
                Toast.makeText(MainActivityVolv.this,
                        R.string.toastText1,
                        Toast.LENGTH_SHORT).show();
            }
        });


        Button btn = (Button) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.e("Log","Hello ...world");
                Toast.makeText(MainActivityVolv.this,
                        R.string.toastText2,
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
