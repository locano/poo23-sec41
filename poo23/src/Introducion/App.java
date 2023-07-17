package Introducion;

public class App {

    // Description:
    // Programa que genera jugadores de x deporte.
    public static void main(String[] args) throws Exception {
        // Creamos 5 jugadores
        // Se genera una instancia (un objeto) de tipo Jugador con todas las propiedades
        // de la clase Jugador

        // Tipo de Variable nombre
        Jugador jugador1 = new Jugador("Ana", 19);
        Jugador jugador2 = new Jugador("Luis", 20);
        Jugador jugador3 = new Jugador("Carlos", 21);
        Jugador jugador4 = new Jugador("Mariel", 22);
        Jugador jugador5 = new Jugador("Ludwing", 26);
        Jugador jugador6 = new Jugador();

        jugador6.setNombre("Luis");


        // jugador2.setDeporte("Test Deporte");
        // jugador1.setSalario(2000);

        // System.out.println(jugador1.getDeporte());
        // System.out.println(jugador2.getDeporte());
        // System.out.println(jugador1.getSalario());
        // System.out.println(jugador2.getSalario());

        // Referencia de memoria de la variable/objeto jugadorx
        System.out.println(jugador1);
//        System.out.println(jugador2);
//        System.out.println(jugador3);
//        System.out.println(jugador4);
//        System.out.println(jugador5);
        System.out.println(jugador6);

        // Utilizamos los metodos de get para obtener un valor.
        System.out.println(jugador1.getNombre());
//        System.out.println(jugador2.getNombre());
//        System.out.println(jugador3.getNombre());
//        System.out.println(jugador4.getNombre());
//        System.out.println(jugador5.getNombre());
        System.out.println(jugador6.getNombre());

        // Modificamos los valores por medio del metodo set - en este caso deporte
//        jugador1.setDeporte("Fut");
//        jugador2.setDeporte("Volley");
//        jugador3.setDeporte("Basket");
//        jugador4.setDeporte("Golf");
//        jugador5.setDeporte("Natación");
//
//        System.out.println("El jugador " + jugador1.getNombre() + " juega el deporte" + jugador1.getDeporte());
//        System.out.println("El jugador " + jugador2.getNombre() + " juega el deporte" + jugador2.getDeporte());
//        System.out.println("El jugador " + jugador3.getNombre() + " juega el deporte" + jugador3.getDeporte());
//        System.out.println("El jugador " + jugador4.getNombre() + " juega el deporte" + jugador4.getDeporte());
//        System.out.println("El jugador " + jugador5.getNombre() + " juega el deporte" + jugador5.getDeporte());

    }
}
