package Array;

import java.util.*;
import java.util.Arrays;

public class FindSecondLargest {
     public static int FindSecondLargest(int n, int[] arr) {
          Arrays.sort(arr);
          for (int i = n - 1; i > 0; i--) {
               if (arr[i] != arr[i - 1]) {
                    return arr[i - 1];
               }
          }
          return -1;
     }

     public static void main(String[] args) {
          int[] arr = { 1, 2, 3, 4, 5 };
          System.out.print("FindSecondLargest");

     }

}
