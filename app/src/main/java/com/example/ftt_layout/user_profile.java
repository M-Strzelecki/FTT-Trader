package com.example.ftt_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

public class user_profile extends AppCompatActivity {
    Button pop_menu;
    TabLayout menubar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.profileMenu, new profile())
                .commit();

        menubar = findViewById(R.id.menuBar);
        menubar.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.profileMenu, new profile())
                                .commit();
                        break;

                    case 1:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.profileMenu, new wallet())
                                .commit();
                        break;
                    case 2:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.profileMenu, new broker())
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
                PopupMenu popup = new PopupMenu(user_profile.this,view);
                popup.setOnMenuItemClickListener(user_profile.this::onMenuItemClick);
                popup.inflate(R.menu.drop_down_menu);
                popup.show();
            }
        });
    }


    public boolean onMenuItemClick(MenuItem item){
        Toast.makeText(this, "You Selected" + item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.option1:
                Intent logout2 = new Intent(user_profile.this, MainActivity.class);
                startActivity(logout2);
                return true;
            case R.id.option2:
                Intent go_to_user_profile = new Intent(user_profile.this, user_profile.class);
                startActivity(go_to_user_profile);
                return true;
            case R.id.option3:
                Intent trade = new Intent(user_profile.this, home.class);
                startActivity(trade);
                return true;
            default:
                return false;
        }
    }
}