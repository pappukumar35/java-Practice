
// package Array;
import java.util.*;

public class LinearSearch {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int row = sc.nextInt();
          int col = sc.nextInt();
          int numbers[][] = new int[row][col];
          int x = sc.nextInt();

          for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                    if (numbers[i][j] == x) {

                    }
               }
          }
          for (int i = 0; i < row; i++) {
               for (int j = 0; j < col; j++) {
                    System.out.println("found at index(" + i + "," + j + ")");
               }
          }

     }
}
