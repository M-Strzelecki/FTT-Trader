package com.example.ftt_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLogin, btnRegister, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnLogin = findViewById(R.id.btnGoLogin);
        btnRegister = findViewById(R.id.btnGoRegister);
        btnBack = findViewById(R.id.btnBackHome);

        //FRAGMENT
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.frameLoginRegister,new aboutfrag())
                .commit();
        //END OF FRAGMENT

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.frameLoginRegister, new registerfrag())
//                        .commit();

                Intent goToRegister = new Intent(MainActivity.this,register.class);
                startActivity(goToRegister);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.frameLoginRegister, new loginfrag())
//                        .commit();

                Intent goToLogin = new Intent(MainActivity.this, login.class);
                startActivity(goToLogin);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frameLoginRegister, new aboutfrag())
                        .commit();

//                Intent goToLogin = new Intent(MainActivity.this, login.class);
//                startActivity(goToLogin);
            }
        });


    }
}