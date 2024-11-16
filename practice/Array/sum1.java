package Array;

public class sum1 {
     public static int[] twoSum(int[] nums, int target) {
          int n = nums.length;
          int ans = 0;
          for (int i = 0; i < nums.length; i++) {
               for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                         return new int[] { i, j };
                    }
               }
          }
          return new int[] {};
     }

     public static void main(String[] args) {
          int[] nums1 = { 2, 7, 11, 15 };
          int target1 = 7;
          int[] result1 = twoSum(nums1, target1);
          System.out.println("indicus:" + result1[0] + "," + result1[1]);

          int[] nums2 = { 2, 5, 40, 12, 15 };
          int target2 = 17;
          int[] result2 = twoSum(nums2, target2);
          System.out.println("Indices:" + result2[0] + "," + result2[1]);

          int[] nums3 = { 3, 3 };
          int target3 = 6;
          int[] result3 = twoSum(nums3, target3);
          System.out.println("Indices: " + result3[0] + ", " + result3[1]);

     }
}
