package RelacionEntreClases;

public class Gato {

    String color;
    String raza;
    int edad;
    // Asociación porque utilizo el objeto veterinario en mi clase gato
    Veterinario veterinario;

    // Constructor Vacio
    Gato() {

    }

    // Constructor con 2 parametros
    Gato(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
        // Dependo del objeto veterinario
        this.veterinario = new Veterinario();
        veterinario.setNombre("Juanito");
        veterinario.saludar();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
