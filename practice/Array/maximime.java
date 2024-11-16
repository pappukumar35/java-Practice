package Array;

import java.util.*;

public class maximime {
     void max() {
          int[] arr = { 1, 2, 3, 4, 5, 6 };
          int ans = 0;
          for (int i = 0; i < 5; i++) {
               if (arr[i] > ans) {
                    ans = arr[i];

               }
          }
          System.out.println("max " + ans);
     }

     public static void main(String[] args) {
          maximime obj = new maximime();
          obj.max();
     }
}
