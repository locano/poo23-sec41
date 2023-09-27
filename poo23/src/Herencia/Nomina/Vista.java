package Herencia.Nomina;

import java.util.Scanner;

public class Vista {
    
    Scanner entrada = new Scanner(System.in);
    Controlador controlador = new Controlador();


    public void pedirInfoDocente(){
        String nombre = entrada.nextLine();
        double salario = entrada.nextDouble();
        double horas_ausente = entrada.nextDouble();

        controlador.llenarDocente(nombre, salario, horas_ausente, nombre, horas_ausente);
    }
}
