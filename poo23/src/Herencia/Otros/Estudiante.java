package Herencia.Otros;

// clase hija / subcalse
public class Estudiante extends Persona{

    //atributos
    String universidad;
    

    public Estudiante() {
        //Hereda el metedo
        this.getNombre();
        // Hereda el atributo
        this.nombre = "Juan";
    }
}
