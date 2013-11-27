package poker;

public class Carta {

    private String palo;
    private String numero;
    private int valor;

    public Carta(String palo, String numero, int valor) {
        this.palo = palo;
        this.numero = numero;
        this.valor = valor;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void iguales(Carta carta1, Carta carta2) {
        if (carta1 == carta2) {
        } else {
        }
    }

    public @Override
    String toString() {
        return "Carta: (" + this.numero + " de " + this.palo + ")";
    }
}
