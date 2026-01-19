package com.docencia.herencia.ejercicio10;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase base abstracta.
 * Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Documento {

    private UUID id;
    private String titulo;

    protected Documento(UUID id){

    }
    protected Documento(UUID id, String titulo) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.titulo = titulo;
    }

    public UUID getId() { return id; }
    public String getTitulo() { return titulo; }

    /** Metodo abstracto para demostrar polimorfismo. */
    public abstract String tipo();

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.id);
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
        final Documento other = (Documento) obj;
        return Objects.equals(this.id, other.id);
    }


    @Override
    public String toString() {
        return "{Documento" +
            " id='" + getId() + "'" +
            ", titulo='" + getTitulo() + "'" +
            "}";
    }


    

}
