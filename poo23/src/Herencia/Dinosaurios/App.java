package Herencia.Dinosaurios;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {

        ArrayList<Especimen> especimenes = new ArrayList<Especimen>();
        ArrayList<Dinosaurio> dino = new ArrayList<Dinosaurio>();
        ArrayList<Planta> plantas = new ArrayList<Planta>();
        especimenes.add(new Dinosaurio(10));
        especimenes.add(new Planta());
        especimenes.add(new Mamifero());

        Especimen temp = especimenes.get(0);
        if(temp.tipo == "Dinosaurio") {
            Dinosaurio dinosaurio = (Dinosaurio) temp;
            System.out.println(dinosaurio.tamanio);
        }
        if( temp instanceof Dinosaurio) {
            Dinosaurio dinosaurio = (Dinosaurio) temp;
            System.out.println(dinosaurio.tamanio);
        }

        // ArrayList<Dinosaurio> dinosaurios = new ArrayList<Dinosaurio>();
        // dinosaurios.add(new Dinosaurio(10));
        // dinosaurios.add(new Dinosaurio(20));
        // dinosaurios.add(new Dinosaurio(30));
        // dinosaurios.add(new Dinosaurio(40));
        // dinosaurios.add(new Dinosaurio(50));
        // dinosaurios.add(new Dinosaurio(60));
        // getDinosaurios(dinosaurios);
        // System.out.println("Dinosaurios:");

    }

    public static ArrayList<Dinosaurio> getDinosaurios(ArrayList<Dinosaurio> dinosaurios) {
        // voy a buscar los mayores,
        // voy a guardarlos y los voy a retornar
        ArrayList<Dinosaurio> mayores = new ArrayList<Dinosaurio>();
        
        for (Dinosaurio dinosaurio_a_guardar : dinosaurios) {
            if(mayores.size() <3) {
                mayores.add(dinosaurio_a_guardar);
            }else{
                for(int i =0; i < mayores.size(); i++) {
                    int cont_temp;
                    Dinosaurio dinosaurio_temp = mayores.get(i);
                  if(dinosaurio_temp.tamanio < dinosaurio_a_guardar.tamanio) {
                    dinosaurio_temp = mayores.get(i);
                    cont_temp = i;
                  }
                }
            }
        }
        return mayores;
    }

    
}
