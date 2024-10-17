package Array;

import java.util.*;

public class indecator {
     public List<Integer> targetIndicator(int nums[], int target) {
          int num = 0;
          int tcount = 0;
          for (int ele : nums) {
               if (ele == target) {
                    tcount++;
               } else if (ele < target) {
                    num++;
               }
          }
          List<Integer> ans = new ArrayList<>();
          while (tcount > 0) {
               ans.add(num);
               num++;
               tcount--;
          }

     }

     public static void main(String[] args) {

     }
}
