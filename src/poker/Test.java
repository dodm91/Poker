package poker;

public class Test {

    public static void main(String args[]) {


        Poker poker = new Poker();
        System.out.println(poker.getBaraja().toString());

        System.out.println();

        for (int i = 0; i < poker.getJugadores().length; i++) {
            System.out.println(poker.getJugadores()[i].toString());
        }

        System.out.println();

        poker.barajar();
        System.out.println(poker.getBaraja().toString());

        System.out.println();

        poker.repartir();

        System.out.println();

        for (int i = 0; i < poker.getJugadores().length; i++) {
            System.out.println(poker.getJugadores()[i].toString());
        }

        poker.faseDescartes();
        poker.repartir();

        System.out.println();

        for (int i = 0; i < poker.getJugadores().length; i++) {
            System.out.println(poker.getJugadores()[i].toString());
        }

        System.out.println();

        System.out.print(poker.calcularGanador());

    }
}
