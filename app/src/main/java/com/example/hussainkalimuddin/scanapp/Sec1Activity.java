package com.example.hussainkalimuddin.scanapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;


import static com.example.hussainkalimuddin.scanapp.R.id.e1;

public class Sec1Activity extends Activity {

    Button scan;
    Button sync;
    ScrollView sc;
    EditText editText;
    RadioGroup rd1;
    RadioButton rd101;
    RadioButton rd102;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec1);

        editText = (EditText) findViewById(e1);
        rd1 = (RadioGroup) findViewById(R.id.rd1);
        rd101 = (RadioButton) findViewById(R.id.rd101);
        rd102 = (RadioButton) findViewById(R.id.rd102);
        scan = (Button) findViewById(R.id.scan);
        sync = (Button) findViewById(R.id.sync);

        scan.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                // final String text1=editText.getText().toString();

                if (editText.getText().toString().isEmpty())

                {
                    editText.requestFocus();
                    editText.setError("Field Cannot be blank");
                }

                if (rd1.getCheckedRadioButtonId() == -1) {
                    rd102.setError("This data required");

                } else {

                    rd102.setError(null);
                }


            }

        });


    }


}
