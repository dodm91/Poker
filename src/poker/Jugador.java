package poker;

import java.util.*;

public class Jugador {

    private String id;
    private int manosGanadas;
    private ArrayList<Carta> cartas;

    public Jugador(String id) {
        this.id = id;
        this.manosGanadas = 0;
        this.cartas = new ArrayList<Carta>();
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

    ArrayList<Carta> descartar() {
        int descartes = (int)(Math.random()*4+1);
        ArrayList<Carta> restantes = new ArrayList<Carta>();
        
        for (int i = 0; i < descartes; i++) {
            this.cartas.remove(0);
        }
        for (int i = 0; i < this.cartas.size(); i++) {
            restantes.add(i,this.cartas.get(0));
        }
        return restantes;
    }

    void cogerCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> mostrarCartas() {
        return cartas;
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
