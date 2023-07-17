package C2DatosExpresiones;

public class Animal {

    // Atributos
    final String dato = "total";
    String tamanio;
    String especie;
    String color;
    boolean vivo;
    boolean sexo;
    int edad;
    double logitud;
    double peso;

    //Constructor Vacio
    //No posee atributos de entrada
    Animal(){

    }

    //Constructo con parametro especie
    Animal(String especie){
    this.especie = especie;
    }

    //Constructor con todos los datos

    Animal(String tamanio, String especie, String color, boolean vivo, boolean sexo, int edad, double logitud, double peso) {
        this.tamanio = tamanio;
        this.especie = especie;
        this.color = color;
        this.vivo = vivo;
        this.sexo = sexo;
        this.edad = edad;
        this.logitud = logitud;
        this.peso = peso;
    }
}
