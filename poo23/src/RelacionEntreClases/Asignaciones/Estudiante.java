package RelacionEntreClases.Asignaciones;

public class Estudiante {
    String nombre;
    Materia materia1;
    Materia materia2;
    Materia materia3;
    Materia materia4;
    Materia materia5;
    Materia materia6;
    Materia materia7;
    Materia materia8;
    Double total_ingresadas;

    Estudiante() {

    }

    Estudiante(String nombre) {
        this.nombre = nombre;
        materia1 = new Materia("Matematicas", 4.0);
        total_ingresadas+=1;
        materia2 = new Materia("Ingles", 3.5);
        total_ingresadas+=1;
        materia3 = new Materia("Programacion", 4.5);
        total_ingresadas+=1;
        materia4 = new Materia("Fisica", 3.0);
        total_ingresadas+=1;
        materia5 = new Materia("Quimica", 4.0);
        total_ingresadas+=1;
        materia6 = new Materia("Quimica", 4.0);
        total_ingresadas+=1;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }

    public void setMateria4(Materia materia4) {
        this.materia4 = materia4;
    }

    public void setMateria5(Materia materia5) {
        this.materia5 = materia5;
    }

    public double getNota1(){
        return materia1.getNota();
    }

    public Materia getMateria1() {
        return materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public Materia getMateria4() {
        return materia4;
    }

    public Materia getMateria5() {
        return materia5;
    }
}
