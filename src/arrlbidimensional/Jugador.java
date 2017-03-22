/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrlbidimensional;

import java.util.Objects;

/**
 *
 * @author ricky_000
 */
public class Jugador {
    String nombre;
    int dorsal;

    public Jugador() {
    }

    public Jugador(String nombre, int dorsal) {
        this.nombre = nombre;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.dorsal);
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
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.dorsal, other.dorsal)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dorsal=" + dorsal + '}';
    }
    
}
