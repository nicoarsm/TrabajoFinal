package com.example.trabajofinalandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class SandwichesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwiches);
        setTitle(R.string.sandwichesMenu);

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);

        final ArrayList<Sandwich> sandwiches = new ArrayList<Sandwich>();

        //SANDWICH 1
        String nombreSandwich = getResources().getString(R.string.chacareroNombre);
        String nombreImagen = "chacarero";
        int idImagen = getResources().getIdentifier(nombreImagen,"drawable",this.getPackageName());
        String descripcionSandwich = getResources().getString(R.string.chacareroDescripcion);
        String precioAux = getResources().getString(R.string.chacareroPrecio);
        int precio = Integer.parseInt(precioAux);
        Sandwich aux = new Sandwich(nombreSandwich,idImagen,descripcionSandwich,precio);
        sandwiches.add(aux);

        //SANDWICH 2
        nombreSandwich = getResources().getString(R.string.barrosNombre);
        nombreImagen = "barros";
        idImagen = getResources().getIdentifier(nombreImagen,"drawable",this.getPackageName());
        descripcionSandwich = getResources().getString(R.string.barrosDescripcion);
        precioAux = getResources().getString(R.string.barrosPrecio);
        precio = Integer.parseInt(precioAux);
        aux = new Sandwich(nombreSandwich,idImagen,descripcionSandwich,precio);
        sandwiches.add(aux);

        //SANDWICH 3
        nombreSandwich = getResources().getString(R.string.chemilicoNombre);
        nombreImagen = "chemilico";
        idImagen = getResources().getIdentifier(nombreImagen,"drawable",this.getPackageName());
        descripcionSandwich = getResources().getString(R.string.chemilicoDescripcion);
        precioAux = getResources().getString(R.string.chemilicoPrecio);
        precio = Integer.parseInt(precioAux);
        aux = new Sandwich(nombreSandwich,idImagen,descripcionSandwich,precio);
        sandwiches.add(aux);

        //SANDWICH 4
        nombreSandwich = getResources().getString(R.string.churrascoNombre);
        nombreImagen = "churrasco";
        idImagen = getResources().getIdentifier(nombreImagen,"drawable",this.getPackageName());
        descripcionSandwich = getResources().getString(R.string.churrascoDescripcion);
        precioAux = getResources().getString(R.string.churrascoPrecio);
        precio = Integer.parseInt(precioAux);
        aux = new Sandwich(nombreSandwich,idImagen,descripcionSandwich,precio);
        sandwiches.add(aux);

        //SANDWICH 5
        nombreSandwich = getResources().getString(R.string.arrolladoNombre);
        nombreImagen = "arrollado";
        idImagen = getResources().getIdentifier(nombreImagen,"drawable",this.getPackageName());
        descripcionSandwich = getResources().getString(R.string.arrolladoDescripcion);
        precioAux = getResources().getString(R.string.arrolladoPrecio);
        precio = Integer.parseInt(precioAux);
        aux = new Sandwich(nombreSandwich,idImagen,descripcionSandwich,precio);
        sandwiches.add(aux);

        //MARGENES BOTON
        int dps = 70;
        final float scale = getResources().getDisplayMetrics().density;
        int pixels = (int) (dps * scale + 0.5f);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                pixels
        );
        params.setMargins((int )(25*scale + 0.5f),(int )(30*scale + 0.5f),(int )(25*scale + 0.5f),0);

        for (Sandwich s: sandwiches) {
            Button boton = new Button(this);

            boton.setText(s.getNombre());
            boton.setLayoutParams(params);
            boton.setBackgroundColor(getResources().getColor(R.color.colorFondoBotones));
            boton.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
            boton.setTextColor(getResources().getColor(R.color.colorLetrasBotones));
            boton.setTypeface(Typeface.DEFAULT_BOLD);

            boton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button b = (Button)v;
                    int i;
                    for(i=0; i<sandwiches.size(); i++){
                        if(sandwiches.get(i).getNombre().equals(((Button) v).getText())){
                            break;
                        }
                    }
                    Sandwich sandwich =sandwiches.get(i);
                    Intent intent = new Intent(SandwichesActivity.this,DetalleActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("serializable", sandwich);
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
            linearLayout.addView(boton);
        }
    }

    public void abrirDetalle(){

    }
}