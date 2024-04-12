import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      // Inizializzazione matrice
      Scanner in = new Scanner(System.in);
      int [][] m = new int[4][4];
 
     // Inserimento numeri nella matrice
      System.out.println("Inserisci i numeri nella matrice");
      for(int i = 0; i < m.length; i++){
        for(int j = 0; j < m[0].length; j++){
          m [i][j] = in.nextInt();
        }
      }

      // Controllo Smmetria (3)
      boolean controllo = isSimmetrica(m);
      if(controllo)
        System.out.println("La matrice è simmetrica");
      else
        System.out.println("La matrice non è simmetrica");
    }




  // Funzione per controllare se la matrice è simmetrica (3)
  private static boolean isSimmetrica(int[][] matrice){
    boolean simmetrica = true;
    for(int i = 0; i < matrice.length; i++){
      for(int j = 0; j < matrice[0].length; j++){
        if(matrice[i][j] != matrice[j][i]){
          return false;
        }
      }
    }
    return simmetrica;
  }
  
}
        
    