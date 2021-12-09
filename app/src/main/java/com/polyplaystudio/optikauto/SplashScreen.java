package com.polyplaystudio.optikauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class SplashScreen extends AppCompatActivity {


    Button createAccount, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();

        createAccount = findViewById(R.id.create_account);
        login = findViewById(R.id.welcome_screen_login);

        createAccount.setOnClickListener(
                view -> {
                    Intent intent = new Intent(this, CreateAccountScreen.class);
                    startActivity(intent);
                }
        );

        login.setOnClickListener(
                view -> {
                    Intent intent = new Intent(this, LoginScreen.class);
                    startActivity(intent);
                }
        );
    }
}