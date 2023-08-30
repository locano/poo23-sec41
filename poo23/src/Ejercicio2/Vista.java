package Ejercicio2;

import java.util.Scanner;

public class Vista {

    Controlador controlador;
    Scanner scanner;

    Vista() {
        controlador = new Controlador();
        scanner = new Scanner(System.in);
    }

    public void agregarProducto() {
        scanner = new Scanner(System.in);
        System.out.println("Ingrese la información del producto:");
        System.out.println("Ingrese Nombre:");

        String nombre = scanner.nextLine();
        System.out.println("Ingrese Precio:");
        int precio = scanner.nextInt();
        System.out.println("Ingrese Cantidad de productos disponibles:");
        int cantidad_total = scanner.nextInt();

        if (controlador.productos.length == controlador.total_productos) {
            System.out.println("No se pueden agregar más productos");
        } else {
            controlador.agregarProducto(nombre, cantidad_total, precio);
            System.out.println("Producto Agregado!");
        }

    }

}
