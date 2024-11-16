package Matrix;

import java.io.*;
import java.util.*;

public class Represent {
     // public static int printmatrix(int matrix[]) {
     // for (int i = 0; i < matrix.length; i++) {
     // for (int j = 0; j < matrix.length; j++) {
     // System.out.print(matrix[i][j]);
     // }

     // }
     // }

     public static void main(String[] args) {
          int matrix[][] = new int[4][3];
          int n = matrix.length, m = matrix.length;
          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    matrix[i][j] = sc.nextInt();

               }
          }
          System.out.println(matrix);
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + "");
               }
               System.out.println();
          }

     }
}
