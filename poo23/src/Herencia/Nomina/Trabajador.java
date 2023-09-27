package Herencia.Nomina;

public class Trabajador {
    double salario;
    double horas_ausente;
    String nombre;
    double descuento;
    double tarifa_horaria;
    double tarifa_diaria;
    // resultado de nomina por usuario
    double nomina;
    String tipo;

    Trabajador(){

    }

    Trabajador(double salario, double horas_ausente, String nombre){
        this.salario = salario;
        this.horas_ausente = horas_ausente;
        this.nombre = nombre;
        this.calcular_tarifa_diaria();
        this.calcular_tarifa_horaria();
        this.calcular_descuento();
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getTarifa_horaria() {
        return tarifa_horaria;
    }
    public void setTarifa_horaria(double tarifa_horaria) {
        this.tarifa_horaria = tarifa_horaria;
    }


    // Metodos para calcular la tarifa y descuento
    public void calcular_tarifa_horaria(){
        this.tarifa_horaria = salario/192;
    }

    public void calcular_descuento(){
        this.descuento = tarifa_horaria * horas_ausente;
    }

    public void calcular_tarifa_diaria(){
        this.tarifa_diaria = salario / 24;
    }

    public void calcularNomina(){
        this.nomina = 100;
    }
}
