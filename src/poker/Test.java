package poker;

public class Test {

    public static void main(String args[]) {


        Poker poker = new Poker();
        System.out.println(poker.getBaraja().toString());

        for (int i = 0; i < poker.getJugadores().length; i++) {
            System.out.println(poker.getJugadores()[i].toString());
        }

        poker.barajar();
        System.out.println(poker.getBaraja().toString());

        for (int i = 0; i < poker.getJugadores().length; i++) {
            poker.getJugadores()[i].cogerCartas(poker.repartir(5));
            System.out.println(poker.getJugadores()[i].getId());
            for (int j = 0; j < poker.getJugadores()[i].mostrarCartas().size(); j++) {
                System.out.println(poker.getJugadores()[i].mostrarCartas().get(j).toString());
            }
        }      

         System.out.println("FASE DESCARTES");

         poker.iniciarFaseDescartes();

         for (int i = 0; i < poker.getJugadores().length; i++) {
         System.out.println(poker.getJugadores()[i].getId());
         for (int j = 0; j < poker.getJugadores()[i].mostrarCartas().size(); j++) {
         System.out.println(poker.getJugadores()[i].mostrarCartas().get(j).toString());
         }
         }   
    }
}
