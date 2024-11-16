package Array;

public class firstMissing {
     private static boolean search(int arr[], int n, int num) {
          for (int i = 0; i < n; i++) {
               if (arr[i] == num) {
                    return false;
               }
          }
          return true;
     }

     public static int findMissing(int arr[], int n) {
          for (int i = 0; i <= n; i++) {
               if (search(arr, n, i) == false) {
                    return i;

               }
          }
          return n + 1;
     }

     public static void main(String[] args) {

     }
}
