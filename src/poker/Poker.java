package poker;

import java.util.ArrayList;

public class Poker {

    private Baraja baraja;
    private Jugador[] jugadores;
    private boolean fase;

    public Poker() {
        this.baraja = new Baraja();

        this.jugadores = new Jugador[4];
        for (int i = 0; i < this.jugadores.length; i++) {
            int j = i + 1;
            this.jugadores[i] = new Jugador("Jugador" + j);
        }
        this.fase = fase;
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
        return fase;
    }

    public void setFase(boolean fase) {
        this.fase = fase;
    }

    void barajar() {
        baraja.barajar();
    }

    public ArrayList<Carta> repartir(int numCartasARepartir) {
        return baraja.repartir(numCartasARepartir);
    }

    void iniciarFaseDescartes() {

        for (int i = 0; i < jugadores.length; i++) {

            ArrayList<Carta> nuevascartas = new ArrayList<Carta>();

            for (int j = 0; j < jugadores[i].getMano().descartar().size(); j++) {
                nuevascartas.add(j,jugadores[i].getMano().descartar().get(j));
            }

            for (int k = 0; k < baraja.repartir(jugadores[i].getMano().descartar().size() - 5).size(); k++) {
                nuevascartas.add(k, baraja.repartir(jugadores[i].getMano().descartar().size() - 5).get(k));
            }
            jugadores[i].getMano().setCartas(nuevascartas);
        }
    }

    void calcularPuntuaciones() {
        int[] puntuaciones = new int[5];
        for (int i = 0; i < jugadores.length; i++) {
           // puntuaciones[i] = jugadores[i].calcularPuntuacion();
        }
    }

    Jugador calcularGanador() {
        return calcularGanador();
    }

    @Override
    public String toString() {
        return "Poker{" + "baraja=" + baraja + ", jugadores=" + jugadores + ", fase=" + fase + '}';
    }
}
