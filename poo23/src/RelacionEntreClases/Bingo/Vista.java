package RelacionEntreClases.Bingo;

import java.util.Scanner;

public class Vista {
    Controlador controlador;
    Scanner sc;
    Vista(){
        sc = new Scanner(System.in);
        controlador = new Controlador();
    }


    public void iniciarJuego(){
        System.out.println("Bienvenido al Bingo");
        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();
        System.out.println("Cual es tu saldo?");
        double saldo = sc.nextDouble();
        controlador.iniciarJuego(nombre,saldo);
    }

    public void informacionJuego(){
        System.out.println("Tu nombre es:");
        
        System.out.println(controlador.getNombre());
        System.out.println("Tu saldo actual es:");
        System.out.println(controlador.getSaldo());
        
    }

    public void getNumero(){
        int num = controlador.nuevoNumero();
        boolean esPar = controlador.esPar(num);
        System.out.println("El numero es:");
        System.out.println(controlador.getFormat(num));
        System.out.println(controlador.getQuetzales(num));
        System.out.println(controlador.getPesos(num));
    }




    public boolean terminarJuego(){

        System.out.println("Deseas Terminar el Juego (S/N)");
        sc = new Scanner(System.in);
        String respuesta = sc.nextLine();

        if(respuesta.equals("S")){
            return false;
        }
        else{
            return true;
        }
    }
}
