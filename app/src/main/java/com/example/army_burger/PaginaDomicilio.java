package com.example.army_burger;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaginaDomicilio extends AppCompatActivity {
    private Button Restaurantes_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_domicilio);

        Restaurantes_btn = findViewById(R.id.Restaurantes);
        Restaurantes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:47.4925,19.0513"));
                Intent chooser = intent.createChooser(intent,"Restaurantes");
                startActivity(chooser);
            }
        });





        Button btnInicio = (Button) findViewById(R.id.btnInicio);
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaginaDomicilio.this, PaginaPrincipal.class));
            }
        });

        Button btnInicio3 = (Button) findViewById(R.id.button3);
        btnInicio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PaginaDomicilio.this, PaginaDomicilio.class));
            }
        });

    }
}