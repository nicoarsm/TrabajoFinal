package com.example.trabajofinalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    Sandwich sandwich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        sandwich = (Sandwich) getIntent().getSerializableExtra("serializable");

        ImageView imagen = findViewById(R.id.imagen);
        TextView titulo = findViewById(R.id.titulo);
        TextView descripcion = findViewById(R.id.descripcion);
        TextView precio = findViewById(R.id.precio);

        setTitle(getResources().getString(R.string.detalle) + " " + sandwich.getNombre().substring(0,1) + sandwich.getNombre().toLowerCase().substring(1).toLowerCase());
        imagen.setImageResource(sandwich.getId_imagen());
        titulo.setText(sandwich.getNombre());
        descripcion.setText(sandwich.getDescripcion());
        precio.setText(getResources().getString(R.string.precio)+sandwich.getPrecio());
    }
}
