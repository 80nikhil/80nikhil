package com.example.nav_component;

import static com.example.nav_component.R.id.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
NavController navcontroller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        navcontroller = Navigation.findNavController(this, main);
//
//        NavigationUI.setupActionBarWithNavController(this,navController);
//    }
//
//    @Override
//    public boolean onSupportNavigateUp() {
//        return navController.navigateUp();
    }
}