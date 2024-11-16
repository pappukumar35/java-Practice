package Recursion;

import java.util.*;

public class Sum_of_Array {
     public static int ArraySum(int arr[], int idx) {
          if (idx == arr.length) {
               return 0;
          }
          int smallAns = ArraySum(arr, idx + 1);
          return smallAns + arr[idx];
     }

     public static void main(pp[] args) {
          int arr[] = { 1, 2, 3, 4 };
          System.out.println(ArraySum(arr, 0));

     }
}
