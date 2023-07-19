package Torneo;

public class Equipo {
    private String nombre;

    private int goles, tarjetas_amarillas, tarjetas_rojas, faltas, juegos_ganados, juegos_perdidos, tiros_esquina,
            posicion, tiros_a_gol;

    Equipo(String nombre, int goles, int tarjetas_amarillas, int tarjetas_rojas, int faltas, int juegos_ganados,
            int juegos_perdidos, int tiros_esquina, int posicion, int tiros_a_gol) {
        this.nombre = nombre;
        this.goles = goles;
        this.tarjetas_amarillas = tarjetas_amarillas;
        this.tarjetas_rojas = tarjetas_rojas;
        this.faltas = faltas;
        this.juegos_ganados = juegos_ganados;
        this.juegos_perdidos = juegos_perdidos;
        this.tiros_esquina = tiros_esquina;
        this.posicion = posicion;
        this.tiros_a_gol = tiros_a_gol;
    }

    public int getTiros_a_gol() {
        return tiros_a_gol;
    }

    public void setTiros_a_gol(int tiros_a_gol) {
        this.tiros_a_gol = tiros_a_gol;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getTiros_esquina() {
        return tiros_esquina;
    }

    public void setTiros_esquina(int tiros_esquina) {
        this.tiros_esquina = tiros_esquina;
    }

    public int getJuegos_perdidos() {
        return juegos_perdidos;
    }

    public void setJuegos_perdidos(int juegos_perdidos) {
        this.juegos_perdidos = juegos_perdidos;
    }

    public int getJuegos_ganados() {
        return juegos_ganados;
    }

    public void setJuegos_ganados(int juegos_ganados) {
        this.juegos_ganados = juegos_ganados;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getTarjetas_rojas() {
        return tarjetas_rojas;
    }

    public void setTarjetas_rojas(int tarjetas_rojas) {
        this.tarjetas_rojas = tarjetas_rojas;
    }

    public int getTarjetas_amarillas() {
        return tarjetas_amarillas;
    }

    public void setTarjetas_amarillas(int tarjetas_amarillas) {
        this.tarjetas_amarillas = tarjetas_amarillas;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
