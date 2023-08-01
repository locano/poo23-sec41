package RelacionEntreClases.Bingo;

public class App {
    
    public static void main(String[] args) {
        Vista vista = new Vista();

        boolean nuevo_juevo = true;

        while(nuevo_juevo){
            vista.iniciarJuego();
            vista.informacionJuego();
            /// logica pra ver numeros
            // nuevo_juevo = vista.terminarJuego();
            vista.getNumero();
            
        }
    }
}
