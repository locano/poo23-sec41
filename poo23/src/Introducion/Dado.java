package Introducion;

public class Dado {

    int caras = 6;
    int cara_actual = 1;
    String tipo = "casino";

    // Constructor
    Dado(){

    }

    Dado(int _cara_actual){

    }


    // Metodos
    public int tirarDado(){
        return 0;
    }

    public String tipoDado(){
        return "es el tipo "+tipo;
    }
}
