package Torneo;

import java.util.Scanner;

public class Vista {

    Controlador controlador = new Controlador();
    Scanner scanner = new Scanner(System.in);
    public void mostrarGoles(){
        int goles = controlador.calcularGoles();
        System.out.println("Los goles totales son: " + goles);
    }

    public void cambiarNombreEquipo1(){
        System.out.println("Ingrese nombre equipo1: ");
        String nombre  = scanner.nextLine();
        controlador.cambiarNombreEquipo1(nombre);
    }
    
}
