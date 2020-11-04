package com.example.scon_rlaruddhks;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navView = findViewById(R.id.bottom_nav);
        navView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction tran = manager.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        tran.replace(R.id.container, HomeFragment.newInstance());
                        break;
                    case R.id.nav_ranking:
                        tran.replace(R.id.container, RankingFragment.newInstance());
                        break;
                    case R.id.nav_highlight:
                        tran.replace(R.id.container, HighLightFragment.newInstance());
                        break;
                    case R.id.nav_toto:
                        tran.replace(R.id.container, TotoFragment.newInstance());
                        break;
                }
                tran.commit();
                return true;
            }
        });
    }
}