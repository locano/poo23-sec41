package Torneo;

public class Controlador {
    Equipo equipo1 = new Equipo(
        "Equipo 1",
        10, // Goles
        5, // Tarjetas amarillas
        2,// Tarjetas rojas
        10, // Faltas
        5, // Juegos ganados
        0, // Juegos perdidos
        10, // Tiros de esquina
        1, // Posicion
        10 // Tiros a gol        
    );
    
    Equipo equipo2 = new Equipo(
        "Equipo 2",
        8, // Goles
        5, // Tarjetas amarillas
        2,// Tarjetas rojas
        10, // Faltas
        4, // Juegos ganados
        1, // Juegos perdidos
        10, // Tiros de esquina
        2, // Posicion
        10 // Tiros a gol        
    );

    Equipo equipo3 = new Equipo(
        "Equipo 3",
        6, // Goles
        5, // Tarjetas amarillas
        2,// Tarjetas rojas
        10, // Faltas
        3, // Juegos ganados
        3, // Juegos perdidos
        10, // Tiros de esquina
        3, // Posicion
        8 // Tiros a gol        
    );

    Equipo equipo4 = new Equipo(
        "Equipo 4",
        4, // Goles
        5, // Tarjetas amarillas
        2,// Tarjetas rojas
        10, // Faltas
        2, // Juegos ganados
        4, // Juegos perdidos
        10, // Tiros de esquina
        4, // Posicion
        6 // Tiros a gol        
    );

    Equipo equipo5 = new Equipo(
        "Equipo 5",
        2, // Goles
        5, // Tarjetas amarillas
        2,// Tarjetas rojas
        10, // Faltas
        1, // Juegos ganados
        5, // Juegos perdidos
        20, // Tiros de esquina
        5, // Posicion
        4 // Tiros a gol        
    );

    public int calcularGoles(){
        return equipo1.getGoles() + equipo2.getGoles() + equipo3.getGoles() + equipo4.getGoles() + equipo5.getGoles();
    }

    public void cambiarNombreEquipo1(String nombre){
        equipo1.setNombre(nombre);
    }
    
}
