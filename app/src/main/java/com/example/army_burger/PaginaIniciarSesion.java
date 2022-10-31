package com.example.army_burger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaIniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_iniciar_sesion);

        Button btnAcceso = (Button) findViewById(R.id.acceso);
        btnAcceso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaginaIniciarSesion.this, PaginaPrincipal.class));
            }
        });

        Button btnCrearNuevaCuenta = (Button) findViewById(R.id.crearnuevacuenta);
        btnCrearNuevaCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaginaIniciarSesion.this, PaginaRegistro.class));
            }
        });
    }
}