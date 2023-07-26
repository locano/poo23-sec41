package RelacionEntreClases.Asignaciones;

public class Vista {

    Controlador controlador;

    Vista(){
        controlador = new Controlador();
    }

    public void mostrarPromedio(){
        System.out.println("El promedio de " + controlador.calcularPromedio());
    }
    
}
