package poker;

import java.util.*;

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

    public void addCarta(Carta carta) {
        this.cartas.add(carta);
        this.calcularValor();
    }

    public void removeCarta(Carta carta) {
        this.cartas.remove(carta);
    }

    public Carta getCarta(int n) {
        return this.cartas.get(n);
    }

    private ArrayList<Carta> copiarMano() {
        ArrayList<Carta> copia = new ArrayList<Carta>();

        for (Carta c : this.cartas) {
            copia.add(c);
        }

        return copia;
    }

    public int descartar() {
        ArrayList<Carta> restantes = new ArrayList<Carta>();

        while (this.cartas.size() > 0) {
            this.repetidas(this.cartas.get(0), restantes);
        }

        this.cartas = restantes;
        return (5 - this.cartas.size());
    }

    private void repetidas(Carta c, ArrayList<Carta> restantes) {
        boolean repetida = false;
        int cnt = 0;
        Carta actual;

        this.cartas.remove(c);
        while (this.cartas.size() > 0 && cnt < this.cartas.size()) {
            actual = this.cartas.get(cnt);
            if (actual.iguales(c)) {
                restantes.add(actual);
                this.cartas.remove(actual);
                repetida = true;
            } else {
                cnt++;
            }
        }
        if (repetida) {
            restantes.add(c);
        }
    }

    private void calcularValor() {
        int valor = 0;

        for (Carta c : this.cartas) {
            valor += c.getValor();
        }

        ArrayList<Carta> manoActual = this.copiarMano();

        int descartes = this.descartar();


        if (descartes == 0) {
            valor += 400;
        } else if (descartes == 2) {
            valor += 300;
        } else if (descartes == 3) {
            valor += 100;
        } else if (descartes == 1) {
            if (this.esPoker()) {
                valor += 500;
            } else {
                valor += 200;
            }
        }

        this.cartas = manoActual;
        this.valor = valor;
    }

    private boolean esPoker() {
        if (this.cartas.get(0).iguales(this.cartas.get(1))
                && this.cartas.get(0).iguales(this.cartas.get(2))
                && this.cartas.get(0).iguales(this.cartas.get(3))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String cadena = "Mano[";

        for (Carta c : this.cartas) {
            cadena += c.toString();
            if (c != this.cartas.get(this.cartas.size() - 1)) {
                cadena += ", ";
            }
        }
        cadena += "]";

        return cadena;
    }
}
