package Herencia.Otros;



// SUB CLASE / CLASE HIJA
public class Jugador extends Persona {
    
    String equipo;

    Jugador(){
       
    }

    @Override
    public String saludar(){
        String x = getNombre();
        return "Hola soy un jugador:" + x;
    }

    // Overloading
    public String saludar(String nombre){
        return "Hola esta es una prueba" + nombre;
    }
}
