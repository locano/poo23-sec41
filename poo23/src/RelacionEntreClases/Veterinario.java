package RelacionEntreClases;

public class Veterinario {

    String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    String direccion;

    Veterinario() {

    }

    public void saludar() {
        System.out.println("Hola soy el veterinario " + nombre);
    }
}
