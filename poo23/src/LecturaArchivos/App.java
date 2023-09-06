package LecturaArchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Codigo para Leer un archivo csv
        try {
            // Leer csv
            // String ruta = "poo23/src/LecturaArchivos/listado_datos.csv";
            // leerArchivo(ruta);
            crearPaises("poo23/src/LecturaArchivos/recintos.csv");
            // Date fecha = new Date();
            // Date anterior_fecha = new Date(2000, 6, 5);
            // System.out.println("FECHA ACTUAL: " + fecha);
            // System.out.println("FECHA temp: " + anterior_fecha);
            // System.out.println("FECHA temp anio: " + anterior_fecha.getYear());

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void leerArchivo(String ruta) throws IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String linea = null;

        try {
            // Cargamos el archivo de deseado
            archivo = new File(ruta);

            // Creamos el objeto FileReader
            fr = new FileReader(archivo);
            // Creamos un buffer de lectura
            br = new BufferedReader(fr);

            // lugar donde se guardara la linea leida
            String[] datos = null;

            // Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) {

                // Utilizamos el separador para los datos
                datos = linea.split(",");

            }

            // Capturamos las posibles excepciones
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr.close();
            }
        }
    }

    public static void crearPaises(String ruta) throws IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        String linea = null;

        ArrayList<Ubicacion> ubicaciones = new ArrayList<Ubicacion>();

        try {
            // Cargamos el archivo de deseado
            // poo23/src/LecturaArchivos/recintos.csv
            archivo = new File(ruta);

            // Creamos el objeto FileReader
            fr = new FileReader(archivo);
            // Creamos un buffer de lectura
            br = new BufferedReader(fr);

            // lugar donde se guardara la linea leida
            String[] datos = null;
            int contador = 0;
            // Leemos hasta que se termine el archivo
            while ((linea = br.readLine()) != null) {

                // Omitir el header
                if (contador == 0) {
                    contador++;
                    continue;
                }
                // Utilizamos el separador para los datos
                datos = linea.split(",");

                int id = Integer.parseInt(datos[0]);
                boolean existe = validarSiExiste(ubicaciones, id);

                if (existe) {
                    continue;
                } else {
                    // Creacion de las ubicaciones
                    Ubicacion ubicacion = new Ubicacion();
                    ubicacion.setId(Integer.parseInt(datos[0]));
                    ubicacion.setNombre(datos[1]);
                    ubicaciones.add(ubicacion);
                }

            }

            // Capturamos las posibles excepciones
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                fr.close();
            }
        }
    }

    public static boolean validarSiExiste(ArrayList<Ubicacion> ubicaciones, int id) {
        for (Ubicacion ubicacion : ubicaciones) {
            if (ubicacion.getId() == id) {
                return true;
            }
        }

        return false;
    }
}
