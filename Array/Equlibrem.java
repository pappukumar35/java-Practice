package Array;

public class Equlibrem {
     public static int ArrayEquilLibraryIndex(int[] arr) {
          int n = arr.length;
          long totalSum = 0;
          for (int num : arr) {
               totalSum += num;
          }
          long leftSum = 0;
          for (int i = 0; i < n; i++) {
               totalSum -= arr[i];
               if (totalSum == leftSum) {
                    return i;
               }
               leftSum += arr[i];
          }
          return -1;
     }

     public static void main(String[] args) {

     }
}