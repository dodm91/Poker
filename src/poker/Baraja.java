package poker;

import java.util.*;

public class Baraja {

    private ArrayList<Carta> cartas;
    private int index;

    public Baraja() {

        int contador = 0;
        this.index = 0;
        
        String nums[] = {"DOS", "TRES", "CUATRO", "CINCO", "SEIS", 
            "SIETE", "OCHO", "NUEVE", "DIEZ", "J", "Q", "K", "AS"};
        String palos[] = {"CORAZONES", "DIAMANTES", "PICAS", "TREBOLES"};

        this.cartas = new ArrayList<Carta>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                this.cartas.add(contador, new Carta(palos[i], nums[j], j+1));
                contador++;
            }
        }
    }

    public void barajar() {
        Collections.shuffle(this.cartas);
    }

    public ArrayList<Carta> repartir(int numCartasARepartir) {
        ArrayList<Carta> cartas2 = new ArrayList<Carta>();

        for (int i = 0; i < numCartasARepartir; i++) {
            cartas2.add(i,this.cartas.get(0));
            this.cartas.remove(0);
        }

        return cartas2;

    }

    public @Override
    String toString() {
        String cadena = "Baraja[";

        for (int i = 0; i < this.cartas.size(); i++) {
            cadena += this.cartas.get(i).toString();
            if (i < this.cartas.size() - 1) {
                cadena += ", ";
            }
        }
        cadena += "]";
        return cadena;
    }
}
