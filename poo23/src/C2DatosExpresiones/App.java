package C2DatosExpresiones;
import java.util.Scanner;


public class App {

    public static void Animales(){

        // Instancia de una clase
        // Objeto - variable
        Animal tortuga = new Animal();
        Animal perro = new Animal("labrador");
        Animal gato = new Animal("grande","sin pelo","piel",true,false,1,30.5,20.3);

        System.out.println("Tortuga especie: " + tortuga.especie);
        System.out.println("Perro especie: " + perro.especie);
        System.out.println("Gato especie: " + gato.especie);

        tortuga.especie = "chiquita";

        System.out.println("Tortuga especie: " + tortuga.especie);
        System.out.println("Perro especie: " + perro.especie);
        System.out.println("Gato especie: " + gato.especie);
        System.out.println("Tortuga especie: " + tortuga.dato);
        System.out.println("Perro especie: " + perro.dato);
        System.out.println("Gato especie: " + gato.dato);

    }


    public static void Personas(){
        // Objetos de tipo persona
        // Instancia de una clase
        Persona profesor = new Persona();
        Persona estudiante = new Persona("Juan","12312312312",20,"15/6/2002");

        System.out.println(estudiante.nombre);
        System.out.println(profesor.nombre);

        Scanner ingresoDatos = new Scanner(System.in);
        System.out.println("Ingrese un nuevo nombre: ");
        String nombre = ingresoDatos.nextLine();
        System.out.println("Ingrese un nueva edad: ");
        int edad = ingresoDatos.nextInt();
        System.out.println("Ingrese un nueva estatura: ");
        double estatura = 0.0;
        
        try{
            estatura = ingresoDatos.nextDouble();
        }catch (Exception e){
            estatura = 10;
        }

        profesor.edad = edad;
        profesor.nombre = nombre;
        profesor.estatura = estatura;
        System.out.println(profesor.nombre);
        System.out.println(profesor.edad);
        System.out.println(profesor.estatura);

    }
    public static void main(String[] args) {
        Personas();
    }
}
