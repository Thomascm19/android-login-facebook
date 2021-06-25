package com.example.facebooklogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etLoginName;
    private EditText etLoginPassword;
    private Button btnLoginSend;
    private String validateUserName = "thomas";
    private String validatePassword = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
        btnLoginSend.setOnClickListener(this);
        etLoginPassword.setOnClickListener(this);
        etLoginName.setOnClickListener(this);
    }

    private void setContentView() {
        etLoginName = findViewById(R.id.editTextTextPersonName);
        etLoginPassword = findViewById(R.id.editTextTextPassword);
        btnLoginSend = findViewById(R.id.button);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button){
            sendLogin();
        }
    }

    private void sendLogin() {
        String userName = etLoginName.getText().toString();
        String userPassword = etLoginPassword.getText().toString();
        if(userName.toLowerCase().equals(validateUserName) && userPassword.toLowerCase().equals(validatePassword)) {
            Intent instagramIntent = new Intent(this,LoginInstagram.class);
            startActivity(instagramIntent);
            // Toast.makeText(this,"Login Exitoso", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this,"Login Incorrecto", Toast.LENGTH_LONG).show();
        }

    }
}