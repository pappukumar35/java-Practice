package Array;

import java.util.*;

public class Search {
     void Array() {
          int[] arr = { 1, 2, 3, 4, 5, 2, 6 };
          int x = 2;
          int ans = -1;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] == x) {
                    ans = -i;

               }

          }
          if (ans == -1) {
               System.out.println("not found");
          } else {
               System.out.println("found" + x + "at index" + ans);

          }
     }

     public static void main(String[] args) {
          Search obj = new Search();
          obj.Array();
     }
}
