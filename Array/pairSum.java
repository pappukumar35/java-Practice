package Array;

public class pairSum {
     public static int pairSum(int arr[], int n, int target) {
          int countPair = 0;
          for (int i = 0; i < n - 1; i++) {
               for (int j = i + 1; j < n; j++) {
                    if (arr[i] + arr[j] == target) {
                         countPair++;
                         break;
                    }
               }
          }
          if (countPair == 0) {
               return -1;
          }
          return countPair;
     }

     public static void main(String[] args) {

     }
}
