package com.example.infogram.view;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.infogram.R;
import com.example.infogram.view.fragmen.homeFragment;
import com.example.infogram.view.fragmen.profaliFragment;
import com.example.infogram.view.fragmen.searchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContaynerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contayner);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {


                    public boolean onNavigationItemSelected( @NonNull MenuItem item) {
                        Fragment selectedFragment = null;

                        switch (item.getItemId()) {
                            case R.id.search:
                                selectedFragment = new searchFragment();
                                break;

                            case R.id.home:
                                selectedFragment = new homeFragment();
                                break;

                            case R.id.profile:
                                selectedFragment = new profaliFragment();
                                break;

                        }
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.container_frame, selectedFragment)
                                .commit();

                        return true;
                    }
                }
        );
    }

}