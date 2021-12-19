package com.polyplaystudio.optikauto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ArrivingScanActivity extends AppCompatActivity {

    Button arrivingNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arriving_scan);

        Objects.requireNonNull(getSupportActionBar()).hide();

        arrivingNextBtn = findViewById(R.id.arriving_next_button);

        arrivingNextBtn.setOnClickListener(
                view -> {
                    Intent intent = new Intent(this, ArrivingResultActivity.class);
                    startActivity(intent);
                }
        );

    }
}