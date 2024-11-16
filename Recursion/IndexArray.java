package Recursion;

import java.util.*;

public class IndexArray {
     public static void findAllIncidence(int a[], int n, int target, int idx) {
          if (idx >= n) {
               return;
          }
          if (a[idx] == target)
               System.out.println(idx);

          findAllIncidence(a, n, target, idx + 1);
     }

     public static void main(pp[] args) {
          int n[] = { 1, 2, 3, 2, 2 };
          int target = 2;
          int a = n.length;

     }

}
