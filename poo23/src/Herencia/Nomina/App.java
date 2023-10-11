package Herencia.Nomina;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

        Trabajador j = new Trabajador(1000, 10, "Juan");
        Trabajador j1 = new Trabajador(1000, 10, "Juan");
        Trabajador j2 = new Trabajador(1000, 10, "Juan");

        trabajadores.add(0,j);
        trabajadores.add(1,j1);
        trabajadores.add(2,j2);

        Docente diego = new Docente(1000, 10, "Juan", "Doctorado", 10);
        trabajadores.add(3,diego);

        
        Trabajador n_trabajador = new Docente(1000, 10, "Juan", "Doctorado", 10);
        
        n_trabajador.calcularNomina();
        diego.calcularNomina();


        Trabajador  temp_j_diego = trabajadores.get(3);
        if(temp_j_diego.tipo == "Docente"){
            Docente temp_diego = (Docente) temp_j_diego;
        }

        if(temp_j_diego instanceof Docente){
            Docente temp_diego = (Docente) temp_j_diego;
        }






    }
}
