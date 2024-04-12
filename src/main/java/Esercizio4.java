import java.util.Scanner;

public class Esercizio4 {
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
            // Trasposizione matrice (4)
            trasposta(m);
            // Stampa matrice trasposta
            for(int i = 0; i < m.length; i++){
              for(int j = 0; j < m[0].length; j++){
                System.out.print(m[i][j] + " ");
              }
              System.out.println();
            }
          }
        // Funzione per trasposizione di una matrice (4)
        private static void trasposta(int[][] matrice){
          for(int i = 0; i < matrice.length; i++){
            for(int j = i + 1; j < matrice[0].length; j++){
              int temp = matrice[i][j];
              matrice[i][j] = matrice[j][i];
              matrice[j][i] = temp;
            }
          }
        }

      }
        
    