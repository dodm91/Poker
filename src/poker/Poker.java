package poker;

import java.util.*;

public class Poker {

    private Baraja baraja;
    private Jugador[] jugadores;
    private boolean faseDescartes;

    public Poker() {
        this.baraja = new Baraja();

        this.jugadores = new Jugador[4];
        for (int i = 0; i < this.jugadores.length; i++) {
            int j = i + 1;
            this.jugadores[i] = new Jugador("Jugador" + j);
        }
        this.faseDescartes = false;
    }

    public Baraja getBaraja() {
        return baraja;
    }

    public void setBaraja(Baraja baraja) {
        this.baraja = baraja;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public boolean isFase() {
        return faseDescartes;
    }

    public void setFaseDescartes(boolean faseDescartes) {
        this.faseDescartes = faseDescartes;
    }

    public Jugador jugar() {
        Jugador ganador;

        this.barajar();
        this.repartir();
        this.faseDescartes();
        this.repartir();
        ganador = this.calcularGanador();
        ganador.setManosGanadas();
        return ganador;
    }

    void barajar() {
        baraja.barajar();
    }

    public void repartir() {
        int num;

        for (int i = 0; i < jugadores.length; i++) {
            if (!this.faseDescartes) {
                num = 5;
            } else {
                num = this.jugadores[i].getDescartadas();
            }
            this.jugadores[i].cogerCartas(baraja.repartir(num));
        }
    }

    public void faseDescartes() {
        for (int i = 0; i < jugadores.length; i++) {
            this.jugadores[i].descartar();
        }
        this.faseDescartes = true;
    }

    public Jugador calcularGanador() {
        int j1, j2, j3, j4;

        for (int i = 0; i < 4; i++) {
            this.jugadores[i].calcularPuntuacion();
        }
        j1 = this.jugadores[0].getPuntuacion();
        j2 = this.jugadores[1].getPuntuacion();
        j3 = this.jugadores[2].getPuntuacion();
        j4 = this.jugadores[3].getPuntuacion();

        if (j1 > j2 && j1 > j3 && j1 > j4) {
            return this.jugadores[0];
        }
        if (j2 > j1 && j2 > j3 && j2 > j4) {
            return this.jugadores[1];
        }
        if (j3 > j1 && j3 > j2 && j3 > j4) {
            return this.jugadores[2];
        }
        return this.jugadores[3];
    }

    @Override
    public String toString() {
        return "Poker{" + "baraja=" + baraja + ", jugadores=" + jugadores + ", fase=" + faseDescartes + '}';
    }
}
