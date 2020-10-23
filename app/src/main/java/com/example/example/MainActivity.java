package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String correo = "admin@mail.com";
    String clave = "admin";
    EditText edtMain_Correo;
    EditText edtMain_Clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        // short = .5 segundos
        // long = 1 segundo
        // Verificacion
        edtMain_Correo = findViewById(R.id.edtMain_Correo);
        edtMain_Clave = findViewById(R.id.edtMain_Clave);


    }

    public void goToHomePage(View view) {
        Intent activityhome = new Intent(this, homeActivity.class);

        if (correo.equals(edtMain_Correo.getText().toString()) && clave.equals(edtMain_Clave.getText().toString())){
            startActivity(activityhome);
            Toast.makeText(this, "Bienvenido al Home", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }

    }

    public void goToSignUp(View view) {
        Intent activitySignUp = new Intent(this, registrar_activity.class);
        startActivity(activitySignUp);
    }
}