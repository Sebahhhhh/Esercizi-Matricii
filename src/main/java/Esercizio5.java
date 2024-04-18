
import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {

        
        Scanner in = new Scanner(System.in);
        int[][] m = new int[4][4];

      System.out.print("Inserisci i numeri nella matrice");
        
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = in.nextInt();
            }
        }
        trasposta(m);
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void trasposta(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = i + 1; j < matrice[0].length; j++) {
                int temp = matrice[i][j];
                matrice[i][j] = matrice[j][i];
                matrice[j][i] = temp;
            }
        }
    }
    public static void sommaRighe(int[][] matrice, int[] vettore) {
        for (int i = 0; i < matrice.length; i++) {
            int somma = 0;
            for (int j = 0; j < matrice[0].length; j++) {
                somma += matrice[i][j];
            }
            vettore[i] = somma;
        }
    }
}
   