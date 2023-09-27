package Herencia.Otros;

public class App {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(20);

        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Pedro");
        estudiante.setEdad(30);
        estudiante.universidad = "UVG";
        String x = estudiante.saludar();
        System.out.println(x);

        Jugador jugador = new Jugador();
        jugador.setNombre("Lionel Messi");
        jugador.setEdad(34);
        jugador.equipo = "Barcelona";
        String y = jugador.saludar();
        String w = jugador.saludar("Willy");
        System.out.println(y);
        System.out.println(w);

    }
    
}
