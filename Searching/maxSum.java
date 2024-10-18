package Searching;

public class maxSum {
     public static long maxSubarraySum(int n, int[] arr) {
          long maxSum = 0;
          for (int i = 1; i < n; i++) {
               for (int j = 1; j < n; j++) {
                    long currSum = 0;
                    for (int k = i; k <= j; k++) {
                         currSum += arr[k];
                    }
                    maxSum = Math.max(maxSum, currSum);
               }

          }
          return maxSum;
     }

     public static void main(String[] args) {

     }
}
