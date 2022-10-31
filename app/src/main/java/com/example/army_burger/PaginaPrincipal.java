package com.example.army_burger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class PaginaPrincipal extends AppCompatActivity {

    private RecyclerView recyclerViewCantante;
    private RecyclerViewAdaptador adaptadorCantante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        recyclerViewCantante=(RecyclerView) findViewById(R.id.recyclerCantante);
        recyclerViewCantante.setLayoutManager(new LinearLayoutManager(this));

        adaptadorCantante=new RecyclerViewAdaptador(obtenerPromociones());
        recyclerViewCantante.setAdapter(adaptadorCantante);
    }

    public List<Promociones> obtenerPromociones(){
        List<Promociones> promociones=new ArrayList<>();
        promociones.add(new Promociones("POP", "Lleva dos hamburguesas más una bebida.", R.drawable.primerapromo));
        promociones.add(new Promociones("BOOM", "Lleva dos hamburguesas más una bebida y papas fritas medianas.", R.drawable.segundapromo));
        promociones.add(new Promociones("BANGTAN", "Lleva dos hamburguesas más un plato de pollo frito más papas fritas.", R.drawable.tercerapromo));
        promociones.add(new Promociones("SAVE ME", "Lleva una bebida, papas fritas y pollo frito.", R.drawable.cuartapromo));
        promociones.add(new Promociones("IDOL", "Lleva una hamburguesas más dos bebidas y pollo frito.", R.drawable.quintapromo));
        promociones.add(new Promociones("GOGO", "Lleva una hamburguesas más una bebidas y un helado.", R.drawable.promoseis));
        promociones.add(new Promociones("MY UNIVERSE", "PROMOCIÓN L: ¡Lleva ya! valido hasta 25 de diciembre. ", R.drawable.promosiete));
        promociones.add(new Promociones("NOT TODAY", "PROMOCIÓN O: ¡Lleva ya! valido hasta 25 de diciembre.  ", R.drawable.promoocho));
        promociones.add(new Promociones("STIGMA", "PROMOCIÓN V: ¡Lleva ya! valido hasta 25 de diciembre.  ", R.drawable.promonueve));
        promociones.add(new Promociones("STAY GOLD", "PROMOCIÓN E: ¡Lleva ya! valido hasta 25 de diciembre. ", R.drawable.promodiez));
        promociones.add(new Promociones("ARMY", "PROMOCIÓN ONLY U: ¡Lleva ya! valido hasta 25 de diciembre. ", R.drawable.promoonce));
        return promociones;
    }
}