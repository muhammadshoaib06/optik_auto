package com.polyplaystudio.optikauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {


    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        //getActionBar().hide();

        login = findViewById(R.id.login_screen_login_button);

        login.setOnClickListener(
                view -> {
                    Intent intent = new Intent(this, BottomNavigationScreen.class);
                    startActivity(intent);
                }
        );
    }
}