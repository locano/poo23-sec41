package RelacionEntreClases.Bingo;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Controlador {

    Usuario usuario;
    Controlador(){
    }

    public void comprarNumero(){
        // Voy a validar si el usuario tiene salgo o no 
    }

    public void iniciarJuego(String nombre, double saldo){
        usuario = new Usuario(nombre,saldo);
    }

    public String getNombre(){
        return usuario.nombre;
    }

    public String getPesos(double x){
        NumberFormat nf =  NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String s = nf.format(x);
        return s;
    }

    public String getQuetzales(double x){
        NumberFormat nf =  NumberFormat.getCurrencyInstance(Locale.US);
        String s = nf.format(x);
        return s;
    }

    public String getFormat(int x){
        NumberFormat nf =  NumberFormat.getInstance(Locale.GERMAN);

        String s = nf.format(x);

        return s;
    }

    public double getSaldo(){
        return usuario.getSaldo();
    }

    public int nuevoNumero(){
        Random rn = new Random();
        int dato = rn.nextInt(100,1000);
        return dato;
    }

    public boolean esPar(int num){

        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
}
