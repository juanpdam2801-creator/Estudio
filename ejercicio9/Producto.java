package com.docencia.herencia.ejercicio9;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase base abstracta. Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Producto {

    private UUID id;
    private String nombre;
    private double precio;

    protected  Producto(UUID id){
        this.id = id;
    }

    protected Producto(UUID id, String nombre, double precio) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * Metodo abstracto para demostrar polimorfismo.
     */
    public abstract String categoria();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "{Producto"
                + " id='" + getId() + "'"
                + ", nombre='" + getNombre() + "'"
                + ", precio='" + getPrecio() + "'"
                + "}";
    }

}
