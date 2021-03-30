package Matriks;

public class PerkalianMatrix {
    public static void main (String[] args){
    int[][] A = {
       {5, 4},
       {3, 1},
       {7, 8}
    };
    int[][] B ={
       {4, 5, 6},
       {2, 4, 6}
};

if (A[0].length--B.length) {
    //int[] [] c = new int [2][2]
    int[][]c = new int[A.length][B[0].length];
     for(int i=0; i<A.length; i++){ //i=0; i<
       for(int j=0; j<B.length; j++){
         for(int k=0;k<A[0].length; k++) {
           C[i][j] += A[i][k] * B[k][j];
          }
        }
      }
      for(int[] c:C) {
        for(int i: c){
            System.out.print(i+" ");
        }
        System.out.println();
      }
    } 
    else {
      System.out.println("Ukuran kolom A tidak sama dengan baris B")
    System.out.println("Ardi Kusuma Bahari");
    }
  }
}