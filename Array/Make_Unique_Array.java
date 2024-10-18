package Array;

import java.util.*;

public class Make_Unique_Array {
     private static boolean findElements(ArrayList<Integer> UniqueArray, int val) {
          for (int i : UniqueArray) {
               if (i == val) {
                    return false;
               }
          }
          return true;

     }

     public static int minElementsToRemove(ArrayList<Integer> arr) {
          int n = arr.size();
          ArrayList<Integer> UniqueArray = new ArrayList<Integer>();
          for (int i = 0; i < n; i++) {
               if (findElements(UniqueArray, arr.get(i))) {
                    UniqueArray.add(arr.get(i));
               }

          }
          return (n - UniqueArray.size());
     }

     public static void main(String[] args) {

     }
}
