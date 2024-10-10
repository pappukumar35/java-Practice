package Array;

public class removeElement {
     public int removeElement(int[] nums, int val) {
          int ptr = 0;
          for (int i = 0; i < nums.length; i++) {
               if (nums[i] != val) {
                    nums[ptr] = nums[i];
                    ptr++;
               }
          }
          return ptr;
     }

     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5 };
          System.out.println();

     }
}