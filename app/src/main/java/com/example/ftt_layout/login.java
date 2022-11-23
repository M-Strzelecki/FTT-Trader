package com.example.ftt_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnReturn = (Button) findViewById(R.id.btnReturn);
        Button Login = (Button) findViewById(R.id.btnSignIn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent goHome = new Intent(login.this, home.class);
                startActivity(goHome);
            }
        });

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent returnMain = new Intent(login.this, MainActivity.class);
                startActivity(returnMain);
            }
        });
    }
}