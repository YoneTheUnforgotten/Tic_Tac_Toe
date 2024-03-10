public class App {
    public static void main(String[] args) throws Exception {
        TTT_ohne_Aenderung game = new TTT_ohne_Aenderung();
        game.ausgabeFeld();
       // game.ziehen(1);
       game.zeile1Gewinnt();
       System.out.println("Test hatGewonnen: " + game.hatGewonnen());
        game.ausgabeFeld();
    }
}
