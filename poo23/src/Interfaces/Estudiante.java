package Interfaces;

public class Estudiante implements Persona, Universidad {

    String nombre;
    String apellido;
    int edad;

    Estudiante(){

    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    // Encabezados con un cuerpo único
    public boolean estaDurmiendo(){
        return false;
    }

    public void correr(){

    }

    public int calcularData(){
        return 0;
    }

    public int getNotas(){
        return 0;
    }

    public String getUniversidad(){
        return "Universidad del Valle de Guatemala";
    }
}
