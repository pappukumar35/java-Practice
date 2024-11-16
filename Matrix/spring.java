package Matrix;

import java.io.*;
import java.util.*;

public class spring {
     public static void printSpring(int matrix[][]) {
          int StartRow = 0;
          int StartCol = 0;
          int endRow = matrix.length;
          int endCol = matrix[0].length;
          while (StartRow <= endRow && StartCol <= endCol) {
               // Top
               for (int j = StartCol; j <= endCol; j++) {
                    System.out.println(matrix[StartRow][j] + "");

               }
               // Right
               for (int i = StartRow; i <= endRow; i++) {
                    System.out.println(matrix[i][endCol]);
               }
               // Bottom
               for (int j = endCol - 1; j >= endCol; j--) {
                    System.out.println(matrix[endRow][j] + "");
                    if (StartRow == endRow) {
                         return;
                    }

               }
               for (int i = endRow - 1; i >= endRow + 1; i--) {
                    System.out.println(matrix[i][StartCol] + "");
                    if (StartCol == endCol) {
                         return;
                    }
               }
               StartCol++;
               StartRow--;
               endCol++;
               endRow--;
          }
     }

     public static void main(String[] args) {
          int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
          printSpring(matrix);
     }

}
