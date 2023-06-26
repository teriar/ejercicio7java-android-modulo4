package com.example.cl.ejercicio7modulo4androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initListeners();
    }

    private void initListeners() {
        
        Button boton = findViewById(R.id.buttonPrincipal);
        FloatingActionButton botonFlotante = findViewById(R.id.buttonFlotante);
        RadioButton radioButtonVerdadero = findViewById(R.id.radioButtonVerdadero);
        RadioButton radioButtonFalso = findViewById(R.id.radioButtonFalso);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Este es un simple boton", Toast.LENGTH_SHORT).show();
            }
        });

        botonFlotante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Este es un boton Flotante", Toast.LENGTH_SHORT).show();
            }
        });
        radioButtonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Este es un radioButton falso", Toast.LENGTH_SHORT).show();
            }
        });

        radioButtonVerdadero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Este es un radio button verdadero", Toast.LENGTH_SHORT).show();
            }
        });

    }
}