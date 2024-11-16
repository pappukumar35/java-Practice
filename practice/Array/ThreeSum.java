package Array;

import java.util.*;

public class ThreeSum {
     public List<List<Integer>> ThreeSum(int[] nums) {
          ArrayList<List<Integer>> list = new ArrayList<>();
          for (int i = 0; i < nums.length - 2; i++) {
               for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[i] + nums[j] + nums[j + 1] == 0) {
                         list.add(Arrays.asList(nums[i], nums[j], nums[j + 1]));
                    }
               }
          }
          return list;

     }

     public static void main(String[] args) {

     }
}
