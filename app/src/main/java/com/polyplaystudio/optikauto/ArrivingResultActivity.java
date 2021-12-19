package com.polyplaystudio.optikauto;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ArrivingResultActivity extends AppCompatActivity {

    Button arrivingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arriving_result);
        Objects.requireNonNull(getSupportActionBar()).hide();

        arrivingBtn = findViewById(R.id.arriving_result_submit_btn);

        arrivingBtn.setOnClickListener(
                view -> {
                    AlertDialog.Builder alertDialogBuilder;
                    alertDialogBuilder = new AlertDialog.Builder(this);
                    alertDialogBuilder.setMessage("Are sure you want to submit new to the database");
                    alertDialogBuilder.setPositiveButton("yes",
                            (arg0, arg1) -> finish());

                    alertDialogBuilder.setNegativeButton("No", (dialog, which) -> finish());

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
        );
    }

    public void arrivingSubmitDialog(View view) {

    }
}