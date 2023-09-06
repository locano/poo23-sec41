package LecturaArchivos;

import java.util.ArrayList;

public class Lugar {
    int id;
    String nombre;
    int capacidad;
    ArrayList<Evento> eventos = new ArrayList<Evento>();

    Lugar(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
