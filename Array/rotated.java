package Array;

import java.util.*;
import java.util.Arrays;

public class rotated {
     public static ArrayList<Integer> rotedArr(ArrayList<Integer> arr, int k) {
          int n = arr.size();
          ArrayList<Integer> rotedArr = new ArrayList<>(arr);
          for (int i = 0; i < n; i++) {
               rotedArr.set((i - k + n) % n, arr.get(i));
          }
          return rotedArr;

     }

     public static void main(String[] args) {

     }
}