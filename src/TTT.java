import java.util.Scanner;

public class TTT {
     int array [][] = new int  [3][3];//0ist nicht belegt/1:Spieler1/2:Spieler2
boolean dasSpielIstBeendet = false;
boolean minimaxGewinnt;
boolean jemandHatGewonnen;
int spieler;

    public TTT() {
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

    public boolean hatGewonnen(){

        boolean minimaxGewinnt = false; //Grundsätlich gewinnt der Gegenspieler wird aber duch methoden abgeändert
     
     if(gleicheInDiagonale() == false){
     for(int i=0;i<array.length;i++){
        //Zeilencheck
        if(array[i][0] == array[i][1] && array[i][1] == array[i][2]){
            jemandHatGewonnen = true;
            if(array[i][0] == 1){
                minimaxGewinnt = true;
            }
            
        }else //Spaltencheck
        if(array[0][i] == array[1][i] && array[1][i] == array[2][i]){
            jemandHatGewonnen = true;
            if(array[i][0] == 1){
                minimaxGewinnt = true;
            }

        }     
    }
    return minimaxGewinnt;
}
}

        
    /**
     * 
     * @return spielergebnis gibt 0 zurück, wenn das Spiel unentschieden ist, 1: wenn Spieler 1 gewonnen hat und 2, wenn Spieler 2 gewonnen hat
     */

     public int hatGewonnenSpieler(){

        boolean minimaxGewinnt = false; //Grundsätlich gewinnt der Gegenspieler wird aber duch methoden abgeändert
     
     if(gleicheInDiagonale() == false){
     for(int i=0;i<array.length;i++){
        //Zeilencheck
        if(array[i][0] == array[i][1] && array[i][1] == array[i][2]){
            jemandHatGewonnen = true;
            if(array[i][0] == 1){
                minimaxGewinnt = true;
            }
            
        }else //Spaltencheck
        if(array[0][i] == array[1][i] && array[1][i] == array[2][i]){
            jemandHatGewonnen = true;
            if(array[i][0] == 1){
                minimaxGewinnt = true;
            }

        }     
    }
    return minimaxGewinnt;
}
}
        

        
        
    



private boolean gleicheInDiagonale(){

    boolean minimaxGewinnt = false;
    //Diagonale links nach rechts
if(array[0][0] == array[1][1] && array[1][1] == array[2][2]){
    if(array[0][0] == 1){
        minimaxGewinnt = true;
    }
    
}

    // Diagonale rechts  nach links
    if(array[2][0] == array[1][1] && array[1][1] == array[0][2]){
        if(array[2][0] == 1){
            minimaxGewinnt = true;
        }
    }
    return minimaxGewinnt;
}

public void ziehen(int spieler){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Bitte x und y koordinate eingeben:");
     int x = scanner.nextInt();
     int y = scanner.nextInt();
     if (x <=2 && x>= 0 && y >= 0 && y <= 3){
        array[x][y] = spieler;
     }
     scanner.close();
}
  public int werGewinnt(){
    if(jemandHatGewonnen == true && spieler == 1){
        return 10;
    }else
    if (jemandHatGewonnen == true && spieler == -1) {
        return -1;
    } else {
        return 0;
    }
  }

}


