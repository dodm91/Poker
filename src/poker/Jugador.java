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

    public void setManosGanadas(int manosGanadas) {
        this.manosGanadas = manosGanadas;
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

    /*
     public int calcularPuntuacion() {
     int puntos = 0;
     int jugada = 0;
     int[] valores = new int[5];
     for (int i = 0; i < this.mostrarCartas().length; i++) {
     valores[i] = this.mostrarCartas()[i].getValor();
     }
     for (int i = 0; i < valores.length; i++) {
     puntos = puntos + valores[i];
     }
     Arrays.sort(valores);

     if (valores[0] == valores[1] || valores[0] == valores[2] || valores[0] == valores[3] || valores[0] == valores[4]) {
     jugada = 1;
     }
     if (valores[1] == valores[2] || valores[1] == valores[3] || valores[1] == valores[4]) {
     jugada = 1;
     }
     if (valores[2] == valores[3] || valores[2] == valores[4]) {
     jugada = 1;
     }
     if (valores[3] == valores[4]) {
     jugada = 1;
     }

     switch (jugada) {
     case 1:
     puntos = puntos + 200;
     break;
     default:
     break;
     }

     return puntos;
     }
     */
    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + '}';
    }
}
