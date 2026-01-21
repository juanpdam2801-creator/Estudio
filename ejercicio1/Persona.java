package com.docencia.herencia.ejercicio1;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase base abstracta. Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Persona {

    private UUID id;
    private String nombre;
    private int edad;

    protected Persona(UUID id) {
        this.id = id;
    }

    protected Persona(UUID id, String nombre, int edad) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    /**
     * Metodo abstracto para demostrar polimorfismo.
     */
    public abstract String rol();

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.id);
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
        final Persona other = (Persona) obj;
        return Objects.equals(this.id, other.id);
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", edad='" + getEdad() + "'" +
            "}";
    }
    

}
