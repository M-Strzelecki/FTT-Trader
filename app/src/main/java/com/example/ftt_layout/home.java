package com.example.ftt_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class home extends AppCompatActivity {
    Button pop_menu;
    TabLayout menubar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.homeMenu, new cryptofrag())
                .commit();

        menubar = findViewById(R.id.menuBar);
        menubar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.homeMenu, new cryptofrag())
                                .commit();
                        break;

                    case 1:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.homeMenu, new stocksfrag())
                                .commit();
                        break;



                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pop_menu = findViewById(R.id.btnPopMenu);
        pop_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(home.this,view);
                popup.setOnMenuItemClickListener(home.this::onMenuItemClick);
                popup.inflate(R.menu.drop_down_menu);
                popup.show();
            }
        });
    }


    public boolean onMenuItemClick(MenuItem item){
        Toast.makeText(this, "You Selected: " + item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.option1:
                Intent logout = new Intent(home.this, MainActivity.class);
                startActivity(logout);
                return true;
            case R.id.option2:
                Intent go_to_user_profile = new Intent(home.this, user_profile.class);
                startActivity(go_to_user_profile);
                return true;
            case R.id.option3:
                Intent trade = new Intent(home.this, home.class);
                startActivity(trade);
                return true;
            default:
                return false;
        }
    }
}