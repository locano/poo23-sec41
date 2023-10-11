package Herencia.Nomina;

public class Docente extends Trabajador {
    double plus_antigueadad;
    double plus_grado_cientifico;
    double anios_trabajados;
    String grado_cientifico;
    String categoria;

    Docente(double salario, double horas_ausente, String nombre, String grado, double anios) {
        // llamar al constructor de la herencia en este caso Trabajador
        super(salario, horas_ausente, nombre);
        // definir parametros de la clase Docente
        this.grado_cientifico = grado;
        this.anios_trabajados = anios;
    }

    public double getPlus_antigueadad() {
        return plus_antigueadad;
    }

    public void setPlus_antigueadad(double plus_antigueadad) {
        this.plus_antigueadad = plus_antigueadad;
    }

    public double getPlus_grado_cientifico() {
        return plus_grado_cientifico;
    }

    public void setPlus_grado_cientifico(double plus_grado_cientifico) {
        this.plus_grado_cientifico = plus_grado_cientifico;
    }

    public void calcular_antiguedad() {

        int total = (int) anios_trabajados / 5;
        this.plus_antigueadad = total * 20;

    }

    public void calcular_grado_cientifico() {
        if (grado_cientifico.toLowerCase().equals("doctorado")) {
            plus_grado_cientifico = 120;
        } else {
            if (grado_cientifico.toLowerCase().equals("master")) {
                plus_grado_cientifico = 80;
            } else {

                plus_grado_cientifico = 0;
            }
        }
    }

    @Override
    public double calcularNomina() {
        this.nomina = super.calcularNomina() + plus_antigueadad + plus_grado_cientifico;

        // Agrego el porcente extra segun categoria
        if (categoria == "instructor") {
            this.nomina = this.nomina * 1.1; // 10%
        }

        if (categoria == "asistente") {
            this.nomina = this.nomina * 1.12; // 12%
        }

        if (categoria == "auxiliar") {
            this.nomina = this.nomina * 1.15; // 15%
        }

        if (categoria == "titular") {
            this.nomina = this.nomina * 1.2; // 20%
        }

        return nomina;
    }
}
