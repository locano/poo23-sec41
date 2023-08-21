package Arreglos;

import java.util.ArrayList;

public class App {
    
    public static void main(String[] args) {
        // arreglosObjetos();
        // accederAleatoriamente();
        arreglosDinamicos();
    }

    public static void arreglosPrimitivos(){

        // Declaración de un arreglo de enteros
        String[] nombres = new String[5];

        // Asignar un valor en un indice
        for (int i =0; i<nombres.length; i ++){
            nombres[i] = "";
        }
        
        // Acceder al valor
        System.out.println(nombres[0]);
    }

    public static void arreglosObjetos(){

        // Una instancia de persona
        Persona personaCreada = new Persona();
        personaCreada.setNombre("Luis");
        personaCreada.setEdad(21);

        // Un arreglo de personas que al inicio son valores null
        Persona[] personas = new Persona[10];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Persona();
        }
        
        // Asisgnando un nombre a la persona en posicion 0
        personas[0] = new Persona();
        personas[0].setNombre("Ana");
        // Accediendo al nombre de la persona en posicion 0
        System.out.println(personas[0].getNombre());


        // Guardar un objeto previamente creado dentro de un arreglo
        personas[5] = personaCreada;

    }

    public static void accederAleatoriamente(){
        // int cont = 0;
        // while(cont <10){
        //     //Hacer Algo
        //     cont++; // cont = cont+1;
        // }

        // for(int i =0; i<10; i++){
        //     System.out.println(i);
        // }

        // Arreglo con datos de tipo String 
        String[] nombres = {"Luis", "Ana", "Pedro", "Maria", "Jose"};
        int longitud = nombres.length;
        int aleatorio = (int) (Math.random() * longitud);
        System.out.println(nombres[aleatorio]);

    }

    public static void arreglosDinamicos(){
        ArrayList<String> nombresDinamicos = new ArrayList<>();

        // Longitud
        int longitud = nombresDinamicos.size();

        // Agragar un valor
        nombresDinamicos.add("Luis");
        nombresDinamicos.add("Ana");
        nombresDinamicos.add("Juan");

        // Longitud
        int longitud2 = nombresDinamicos.size();

        System.out.println(nombresDinamicos.get(1));

        // eliminar un valor
        nombresDinamicos.remove(1);


        // Longitud
        int longitud3 = nombresDinamicos.size();

        ArrayList<Persona> personasDinamicos = new ArrayList<>();

        Persona x = new Persona();
        personasDinamicos.add(x);

    }

}
