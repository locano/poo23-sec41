package Herencia;

// SUPER CLASE / CLASE PADRE
public class Persona {
    
    // atributos
    String nombre;
    int edad;


    //constructores
    public Persona() {
    }


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    //metodos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String saludar(){
        return "Hola amigos yo soy: " + nombre;
    }
}
