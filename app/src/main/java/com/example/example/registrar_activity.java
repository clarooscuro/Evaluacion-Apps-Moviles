package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class registrar_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_activity);
    }

    public void goToLogin(View view) {
        Intent activitylogin = new Intent(this, MainActivity.class);
        startActivity(activitylogin);
    }

}