package com.polyplaystudio.optikauto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.Objects;

public class ExitScanActivity extends AppCompatActivity {

    Button exitSumbitBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_scan);
        Objects.requireNonNull(getSupportActionBar()).hide();
        exitSumbitBtn = findViewById(R.id.exit_next_button);

        exitSumbitBtn.setOnClickListener(
                view -> {
                    Intent intent = new Intent(this, ExitResultActivity.class);
                    startActivity(intent);
                }
        );
    }
}