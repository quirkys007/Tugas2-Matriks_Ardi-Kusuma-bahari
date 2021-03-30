package Matriks;
import java.util.Scanner;

public class TransposMatrix {
    public static void main (String[] args){
        int i, j, k, l;
        int matriks[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("MAsukkan jumlah baris matriks: ");
        k = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        l = scan.nextInt();
        System.out.println("Masukkan elemen matriks: ");
        for(i = 0; i<k; i++){
          for(j = 0; j<l; j++){
            matriks[i][j] = scan.nextInt();
          }
        }
        System.out.println("Hasil transpose matriks: ");
        for(i = 0; i<k; i++){
          for(j = 0;j<l; j++){
            Sysytem.out.print(transpose[i][j] + "\t");
          }
          System.out.println();
          System.out.println("Ardi Kusuma Bahari");
         }
      }
    }
