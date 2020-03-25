package com.example.trabajofinalandroid;

import java.io.Serializable;

public class Sandwich implements Serializable {
    private String nombre;
    private int id_imagen;
    private String descripcion;
    private int precio;

    public Sandwich(String nombre, int id_imagen, String descripcion, int precio) {
        this.nombre = nombre;
        this.id_imagen = id_imagen;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrecio() {
        return precio;
    }
}
