package com.example.infogram;

import android.os.Bundle;

import com.example.infogram.view.ContaynerActivity;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.infogram.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.infogram.view.CreateAccountActivity;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void goCreateAccout(View view)
    {
        Intent intent=new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    public void login (View view)
    {
        Intent intent=new Intent(this, ContaynerActivity.class);
        startActivity(intent);

    }


}