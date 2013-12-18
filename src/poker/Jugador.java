package poker;

import java.util.*;

public class Jugador {

    private String id;
    private int manosGanadas;
    private Mano mano;
    private int descartadas;
    private int puntuacion;

    public Jugador(String id) {
        this.id = id;
        this.manosGanadas = 0;
        this.mano = new Mano();
        this.descartadas = 0;
        this.puntuacion = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getManosGanadas() {
        return manosGanadas;
    }

    public void setManosGanadas() {
        this.manosGanadas = manosGanadas + 1;
    }

    public Mano getMano() {
        return mano;
    }

    public void setMano(Mano mano) {
        this.mano = mano;
    }

    public int getDescartadas() {
        return descartadas;
    }

    public void setDescartadas(int descartadas) {
        this.descartadas = descartadas;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public void descartar() {
        this.descartadas = this.mano.descartar();
    }

    public void cogerCartas(ArrayList<Carta> cartas) {
        if (cartas.size() == 5) {
            this.mano.setCartas(cartas);
        } else {
            for (Carta c : cartas) {
                this.mano.addCarta(c);
            }
        }
    }
    
        public void calcularPuntuacion() {
        this.puntuacion = this.mano.getValor();
    }

    @Override
    public String toString() {
        String cadena = "Jugador[";

        cadena += "Id: " + this.id + ", ";
        cadena += "ManosGanadas: " + this.manosGanadas + ", ";
        cadena += "Descartadas: " + this.descartadas + ", ";
        cadena += "Puntuación: " + this.puntuacion + ", ";
        cadena += this.mano.toString();
        cadena += "]";

        return cadena;
    }
}
