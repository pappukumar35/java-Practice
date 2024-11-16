import java.util.*;

public class Transpose {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int m = sc.nextInt();
          int matrix[][] = new int[n][m];

          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    matrix[n][m] = sc.nextInt();
               }
          }
          System.out.println("the transpose matrix is: ");
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < m; j++) {
                    System.out.println(matrix[n][m] + " ");
               }
               System.out.println();
          }
     }
}
