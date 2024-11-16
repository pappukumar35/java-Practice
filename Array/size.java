package Array;

import java.util.*;
import java.util.ArrayList;

public class size {
     public static void main(String[] args) {
          int n = 5;

          ArrayList<Integer> arr1 = new ArrayList<>(n);
          ArrayList<Integer> arr2 = new ArrayList<>();
          System.out.println("Array1:" + arr1);
          System.out.println("Array1:" + arr2);
          for (int i = 1; i <= n; i++) {
               arr1.add(i);
               arr2.add(i);
          }
          System.out.println("Array" + arr1);
          System.out.println("Array" + arr2);

     }
}
