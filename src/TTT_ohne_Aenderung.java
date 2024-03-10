import java.util.Scanner;
//Verwendung des Repository mit github: https://learn.microsoft.com/de-de/azure/developer/javascript/how-to/with-visual-studio-code/clone-github-repository?tabs=activity-bar

public class TTT_ohne_Aenderung {
     int array [][] = new int  [3][3];//0ist nicht belegt/1:Spieler1/2:Spieler2
boolean dasSpielIstBeendet = false;

    public TTT_ohne_Aenderung() {
        for(int i=0;i<3;i++){
           for(int j=0;j<3;j++){
            array[i][j] =0;
           }
        }
    }

    public void ausgabeFeld(){
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

         }
    }

    /**
     * 
     * @return spielergebnis gibt 0 zurück, wenn das Spiel unentschieden ist, 1: wenn Spieler 1 gewonnen hat und 2, wenn Spieler 2 gewonnen hat
     */

    public int hatGewonnen(){

        int spielergebnis = 0; //grundsätzlich erst mal unentschieden gleich 0
        boolean jemandHatGewonnen = false;

        for(int i=0;i<array.length && !jemandHatGewonnen;i++){
            //Zeilencheck
            if(array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][0] != 0){
                jemandHatGewonnen = true;
                spielergebnis = array[i][0];
            }else //Spaltencheck
            if(array[0][i] == array[1][i] && array[1][i] == array[2][i] && array[0][i] != 0){
                jemandHatGewonnen = true;
                spielergebnis = array[0][i];

            }     
        }

        //Diagonale prüfen, wenn keine Zeile oder Spalte schon komplett mit dem gleichen Zeichen ausgefüllt ist
        if (spielergebnis == 0){
            spielergebnis = gleicheInDiagonale();
            if (spielergebnis != 0){
                jemandHatGewonnen = true;
            }
        }

        
        return spielergebnis;
    }



private int gleicheInDiagonale(){

    int spielergebnis = 0;
    //Diagonale links nach rechts
if(array[0][0] == array[1][1] && array[1][1] == array[2][2]){
    spielergebnis = array[0][0];
}

    // Diagonale rechts  nach links
    if(array[2][0] == array[1][1] && array[1][1] == array[0][2]){
        spielergebnis = array[2][0];
    }
    return spielergebnis;
}

public void ziehen(int spieler){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Bitte x und y koordinate eingeben:");
     int x = scanner.nextInt();
     int y = scanner.nextInt();
     if (x <=2 && x>= 0 && y >= 0 && y <= 2){
        array[x][y] = spieler;
     }
     scanner.close();
}
  


public void zeile1Gewinnt(){
    array[0][0] = 1;
    array[0][1] = 1;
    array[0][2] = 1;
    array[1][0] = 1;
    array[1][1] = 1;
    array[1][2] = 1;
    array[2][0] = 1;
    array[2][1] = 1;
    array[2][2] = 1;
}





}


