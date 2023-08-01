package RelacionEntreClases.Bingo;

public class Usuario {

    String nombre;
    double saldo;
    int num1;
    int num2;
    int num3;
    int numerosComprados;

    Usuario(String nombre, double saldo){
        this.saldo = saldo;
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNumerosComprados() {
        return numerosComprados;
    }

    public void setNumerosComprados(int numerosComprados) {
        this.numerosComprados = numerosComprados;
    }
    
}
