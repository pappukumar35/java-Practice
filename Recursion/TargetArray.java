package Recursion;

import java.util.*;

public class TargetArray {
     public static boolean search(int a[], int n, int target, int idx) {
          if (idx >= n)
               return false;
          if (a[idx] == target)
               return true;
          return search(a, n, target, idx + 1);
     }

     public static void main(pp[] args) {
          int n[] = { 1, 2, 3, 4 };
          int target = 4;

          if (search(n, n.length, target, 0)) {
               System.out.println("yes");
          } else {
               System.out.println("no");
          }
     }

}
