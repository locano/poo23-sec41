package RelacionEntreClases.Asignaciones;

public class Materia {

    String nombre;
    Double nota;


    Materia(){
        
    }

    Materia(String nombre, Double nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getNota() {
        return nota;
    }

}
