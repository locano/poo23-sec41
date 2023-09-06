package LecturaArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        // Codigo para Leer un archivo csv
        try {
            // Leer csv
            String ruta = "poo23/src/LecturaArchivos/listado_datos.csv";
            leerArchivo(ruta);
                       
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


    public static void leerArchivo(String ruta) throws IOException{
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String linea = null;


        try {
            //Cargamos el archivo de deseado
            archivo = new File(ruta);

            //Creamos el objeto FileReader
            fr = new FileReader(archivo);
            //Creamos un buffer de lectura
            br = new BufferedReader(fr);
 
            // lugar donde se guardara la linea leida
            String[] datos = null;
 
            //Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) {
 
                //Utilizamos el separador para los datos
                datos = linea.split(",");
 
            }
 
            //Capturamos las posibles excepciones
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
                if (fr != null) {
                    fr.close();
                }
        }
    }
}
