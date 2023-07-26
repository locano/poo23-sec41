package RelacionEntreClases.Asignaciones;

public class Controlador {

    Estudiante estudiante;

    Controlador(){
        estudiante = new Estudiante("Ludwing");
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Double calcularPromedio() {

        Double nota1 = estudiante.getNota1();
        Double nota2 = estudiante.getMateria2().getNota();
        Double nota3 = estudiante.getMateria3().getNota();
        Double nota4 = estudiante.getMateria4().getNota();
        Double nota5 = estudiante.getMateria5().getNota();
        Double promedio = (nota1 + nota2 + nota3 + nota4 + nota5) / estudiante.total_ingresadas;
        return promedio;
    }



    
}
