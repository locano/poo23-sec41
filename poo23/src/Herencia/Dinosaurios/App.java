package Herencia.Dinosaurios;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        ArrayList<Dinosaurio> dinosaurios = new ArrayList<Dinosaurio>();
        dinosaurios.add(new Dinosaurio(10));
        dinosaurios.add(new Dinosaurio(20));
        dinosaurios.add(new Dinosaurio(30));
        dinosaurios.add(new Dinosaurio(40));
        dinosaurios.add(new Dinosaurio(50));
        dinosaurios.add(new Dinosaurio(60));

        System.out.println("Dinosaurios:");

    }

    public ArrayList<Dinosaurio> getDinosaurios(ArrayList<Dinosaurio> dinosaurios) {
        // voy a buscar los mayores,
        // voy a guardarlos y los voy a retornar
        ArrayList<Dinosaurio> mayores = new ArrayList<Dinosaurio>();
        
        for (Dinosaurio dinosaurio_a_guardar : dinosaurios) {
            if(mayores.size() <=3) {
                mayores.add(dinosaurio_a_guardar);
            }else{
                for(int i =0; i < mayores.size(); i++) {
                  if(mayores.get(i).tamanio < dinosaurio_a_guardar.tamanio) {
                      mayores.set(i, dinosaurio_a_guardar);
                      break;
                  }
                }
            }
        }
        return mayores;
    }
}
