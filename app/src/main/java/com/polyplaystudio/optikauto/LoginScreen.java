package com.polyplaystudio.optikauto;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.polyplaystudio.optikauto.WebServices.ResObj;
import com.polyplaystudio.optikauto.WebServices.UserService;

import java.util.Objects;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginScreen extends AppCompatActivity {


    Button login;
    EditText loginEmail, loginPassword;
    UserService userService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        Objects.requireNonNull(getSupportActionBar()).hide();

        login = findViewById(R.id.login_screen_login_button);

        loginEmail = findViewById(R.id.login_email_field);
        loginPassword = findViewById(R.id.login_password_field);

        //userService = ApiUtils.getUserService();

        login.setOnClickListener(
                view -> {
                    Intent intent = new Intent(this, BottomNavigationScreen.class);
                    startActivity(intent);
//                    String username = loginEmail.getText().toString();
//                    String password = loginPassword.getText().toString();
//                    //validate form
//                    if (validateLogin(username, password)) {
//                        //do login
//                        doLogin(username, password);
//                    }
                }
        );
    }


    private boolean validateLogin(String username, String password) {
        if (username == null || username.trim().length() == 0) {
            Toast.makeText(this, "Username is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (password == null || password.trim().length() == 0) {
            Toast.makeText(this, "Password is required", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void doLogin(final String username, final String password) {
        Call call = userService.login(username, password);
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                if (response.isSuccessful()) {
                    ResObj resObj = (ResObj) response.body();
                    if (resObj.getMessage().equals("true")) {
                        //login start main activity
                        Intent intent = new Intent(LoginScreen.this, BottomNavigationScreen.class);
                        intent.putExtra("username", username);
                        startActivity(intent);

                    } else {
                        Toast.makeText(LoginScreen.this, "The username or password is incorrect", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginScreen.this, "Error! Please try again!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Toast.makeText(LoginScreen.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

}