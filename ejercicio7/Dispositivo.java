package com.docencia.herencia.ejercicio7;

import java.util.Objects;
import java.util.UUID;

/**
 * Clase base abstracta. Incluye un identificador unico (UUID) y campos comunes.
 */
public abstract class Dispositivo {

    private UUID id;
    private String fabricante;

    protected Dispositivo(UUID id){
        this.id = id;
    }

    protected Dispositivo(UUID id, String fabricante) {
        this.id = id == null ? UUID.randomUUID() : id;
        this.fabricante = fabricante;
    }

    public UUID getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    /**
     * Metodo abstracto para demostrar polimorfismo.
     */
    public abstract String tipo();

    
   

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final Dispositivo other = (Dispositivo) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "{Dispositivo " +
            " id='" + getId() + "'" +
            ", fabricante='" + getFabricante() + "'" +
            "}";
    }

}
