package Recursion;

import java.util.*;
import java.util.*;

public class Target {
     static ArrayList<Integer> AllIncident(int a[], int n, int target, int idx) {
          if (idx >= n) {
               return new ArrayList<Integer>();
          }
          ArrayList<Integer> ans = new ArrayList<Integer>();
          if (a[idx] == target) {
               ans.add(idx);
          }
          ArrayList<Integer> smallAns = AllIncident(a, n, target, idx + 1);
          ans.addAll(smallAns);
          return ans;
     }

     public static void main(pp[] args) {
          int a[] = { 1, 4, 3, 4, 4 };
          int target = 4;
          int n = a.length;
          ArrayList<Integer> ans = AllIncident(a, n, target, 0);
          for (Integer i : ans) {
               System.out.println(i);
          }

     }

}
