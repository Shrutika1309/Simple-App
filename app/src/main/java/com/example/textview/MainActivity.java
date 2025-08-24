package com.example.textview; // Change this to match your actual package name

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure your XML file is named activity_main.xml

        // Linking views with their IDs from XML
//        usernameEditText = findViewById(R.id.username);
//        passwordEditText = findViewById(R.id.password);
//        loginButton = findViewById(R.id.login_button);

        // Handling login button click
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both username and password", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity.this, "Login successful for " + username, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
