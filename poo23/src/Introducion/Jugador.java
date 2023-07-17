package Introducion;

// Random
public class Jugador {

    // Atributos
    private String deporte;
    private String nombre;
    private int uniforme;
    private int edad;
    private double salario;

    // Constructor
    Jugador(String nombre, int _edad) {
        System.out.println("jugador nuevo con datos");
        this.nombre = nombre;
        this.edad = _edad;
    }
    
    Jugador(){
        System.out.println("jugador nuevo sin datos");

    }
    


    
    // Metodos (acciones)


    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setUniforme(int uniforme) {
        this.uniforme = uniforme;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDeporte() {
        return this.deporte;
    }

    public int getUniforme() {
        return this.uniforme;
    }

    public double getSalario() {
        return this.salario;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

}
