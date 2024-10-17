package Array;

import java.util.*;

public class Sum {
     void sumofArray() {
          int[] arr = { 12, 14, 13, 15, 10 };
          int sum = 0;
          for (int i = 0; i < 5; i++) {
               sum = sum + arr[i];

          }
          System.out.println(sum);
     }

     public static void main(String[] args) {
          Sum obj = new Sum();
          obj.sumofArray();
     }
}
