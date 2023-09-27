package Herencia.Nomina;

public class Controlador {
    Trabajador j;
    Docente x;
    NoDocente y;
    
    Controlador(){
        j = new Trabajador();
        y = new NoDocente();
    }

    public void llenarDocente(String nombre, double salario, double horas_ausente, String grado, double anios){
        x = new Docente(salario, horas_ausente, nombre, grado, anios);
    }
}
