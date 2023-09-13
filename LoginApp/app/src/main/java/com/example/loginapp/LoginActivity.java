package com.example.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsername, etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check username and password here (e.g., by querying an SQLite database)
                // If the credentials are valid, navigate to the main activity
                if (isValidCredentials(etUsername.getText().toString(), etPassword.getText().toString())) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    // Display an error message or toast for invalid credentials
                }
            }
        });
    }

    private boolean isValidCredentials(String username, String password) {
        // Implement your authentication logic here (e.g., check against an SQLite database)
        // Return true if the credentials are valid; otherwise, return false
        return false;
    }
}
