package Matrix;

import java.io.*;
import java.util.*;

public class diagonal {
     public static void printMatrix(int matrix[][]){
          int sum=0;
          for(int i=0;i<matrix.length;i++){
               for(int j=0;j<matrix.length-1;j++){
                    if(i==j){
                         sum +=matrix[i][j];
                    }
                    else if(i+j=matrix.length-1){
                         sum+=matrix[i][j];
                    }
               }
               return sum;
          }

     }

     public static void main(String args[]) {
          int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
     }

}
