package com.docencia.herencia.ejercicio4;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase base abstracta. Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Animal {

    private UUID id;
    private String nombre;

    protected  Animal(UUID id){
        this.id = id;
    }
    protected Animal(UUID id, String nombre) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.nombre = nombre;
    }

    public UUID getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo abstracto para demostrar polimorfismo.
     */
    public abstract String sonido();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Animal other = (Animal) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "{Animal : " +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}
