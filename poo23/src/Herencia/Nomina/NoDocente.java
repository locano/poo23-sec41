package Herencia.Nomina;

public class NoDocente extends Trabajador {
    double cantidad_feriados;
    double plus_feriados;

    NoDocente() {
    }

    public double getCantidad_feriados() {
        return cantidad_feriados;
    }

    public void setCantidad_feriados(double cantidad_feriados) {
        this.cantidad_feriados = cantidad_feriados;
    }

    public double getPlus_feriados() {
        return plus_feriados;
    }

    public void setPlus_feriados(double plus_feriados) {
        this.plus_feriados = plus_feriados;
    }

    public void calcular_extra_feriados() {
        this.plus_feriados = tarifa_diaria * 2 * cantidad_feriados;
    }

    public void calcularNomina(){
        this.nomina = salario - descuento + plus_feriados;
    }
}
