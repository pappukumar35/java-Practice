package Array;

public class matrix1 {
     public static boolean isMatrixSummetric(int[][] matrix) {
          int n = matrix.length;
          int[][] transpose = new int[n][n];
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    transpose[i][j] = matrix[j][i];
               }
          }
          for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                    if (matrix[i][j] != transpose[i][j]) {
                         return false;
                    }
               }

          }
          return true;
     }

     public static void main(String[] args) {

     }
}
