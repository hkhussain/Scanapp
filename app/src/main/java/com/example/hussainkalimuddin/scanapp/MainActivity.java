package com.example.hussainkalimuddin.scanapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button strt_app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strt_app=(Button) findViewById(R.id.strt_app);
        strt_app.setOnClickListener(this);
    }


    public void onClick(View v)
    {
        switch(v.getId()) {
            case R.id.strt_app:
                Intent sec1 = new Intent(this, Sec1Activity.class);
                startActivity(sec1);

                break;

        }



    }










}

