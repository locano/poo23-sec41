package ArregloMultidimencionales;

import java.util.Scanner;

/**
 * App
 */
public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // int[][] numeros = new int[5][12];

        // for (int i = 0; i < numeros.length; i++) { // Recorre las columnas
        // for (int j = 0; j < numeros[0].length; j++) { // Recorre las filas
        // numeros[i][j] = (int) (Math.random() * 100);
        // }
        // }

        // Persona[][] personas = new Persona[2][5];
        // for (int i = 0; i < personas.length; i++) { // Recorre las columnas
        // for (int j = 0; j < personas[0].length; j++) { // Recorre las filas
        // personas[i][j] = new Persona();
        // }
        // }

        try {
            getNombre();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error general:" + e.getMessage());
        } finally {
            // System.out.println("Siempre se ejecuta");
        } 




    }

    public static void getNombre() throws Exception {
        // try {
        String nombre = "";
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        getEdad();
        // } catch (Exception e) {
        // // TODO: handle exception
        // System.out.println("Ingrese un dato valido");
        // }

    }

    public static void getEdad() throws Exception {

        boolean ingresar_edad = true;

        while (ingresar_edad) {
            // try {
            int edad = 0;
            System.out.println("Ingrese su edad: ");
            edad = sc.nextInt();

            if ((edad % 2) == 0) {
                System.out.println("Es par");
            } else {
                System.out.println("Es impar");
                throw new Exception("Edad impar");
            }
            ingresar_edad = false;
            // } catch (Exception e) {
            // // TODO: handle exception
            // System.out.println("Ingrese un numero entero");
            // sc = new Scanner(System.in);
            // }
        }

    }
}