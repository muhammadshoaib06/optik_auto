package com.polyplaystudio.optikauto;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ExitResultActivity extends AppCompatActivity {

    Button exitNextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_result);
        Objects.requireNonNull(getSupportActionBar()).hide();

        exitNextBtn = findViewById(R.id.exit_result_submit_btn);

        exitNextBtn.setOnClickListener(
                view -> {
                    AlertDialog.Builder alertDialogBuilder;
                    alertDialogBuilder = new AlertDialog.Builder(this);
                    alertDialogBuilder.setMessage("Are sure you want to Remove this record from in stock");
                    alertDialogBuilder.setPositiveButton("yes",
                            (arg0, arg1) -> finish());

                    alertDialogBuilder.setNegativeButton("No", (dialog, which) -> finish());

                    AlertDialog alertDialog = alertDialogBuilder.create();
                    alertDialog.show();
                }
        );
    }

    public void exitSubmitDialog(View view) {

    }
}