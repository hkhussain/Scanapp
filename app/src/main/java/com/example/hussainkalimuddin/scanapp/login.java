package com.example.hussainkalimuddin.scanapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button   login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username=(EditText)findViewById(R.id.user);
        password=(EditText)findViewById(R.id.pass);
        login=(Button)findViewById(R.id.login);

        login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                if (username.getText().toString().equals("test") && password.getText().toString().equals("test"))
                {

                    Intent main =new Intent(login.this,MainActivity.class);
                    startActivity(main);


                }

                else
                {

                    username.setText("");
                    password.setText("");
                    username.requestFocus();
                    Toast.makeText(login.this, "Incorrect Credential", Toast.LENGTH_SHORT).show();

                }


            }
        });





    }
}
