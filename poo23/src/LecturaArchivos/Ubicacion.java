package LecturaArchivos;

import java.util.ArrayList;

public class Ubicacion {
    int id;
    String nombre;
    ArrayList<Lugar> lugares = new ArrayList<Lugar>();

    Ubicacion(){

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
    
}
