/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Collections;
import java.util.ArrayList;

/**
 *
 * @author Angel
 */
public class Mano {

    private ArrayList<Carta> cartas;
    private int valor;

    public Mano() {
        this.cartas = new ArrayList<Carta>();
        this.valor = 0;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    ArrayList<Carta> descartar() {
        int descartes = (int) (Math.random() * 4 + 1);
        ArrayList<Carta> restantes = new ArrayList<Carta>();

        descartes = 5 - descartes;

        for (int i = 0; i < descartes; i++) {
            restantes.add(i, this.cartas.get(i));
        }
        return restantes;
    }
}
