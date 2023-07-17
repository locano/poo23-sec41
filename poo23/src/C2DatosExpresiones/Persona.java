package C2DatosExpresiones;

public class Persona {

    String nombre, id;
    int edad;
    String fecha_nacimiento;
    String tipo;
    double estatura;

    Persona(){

    }

    public Persona(String nombre, String id, int edad, String fecha_nacimiento) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
