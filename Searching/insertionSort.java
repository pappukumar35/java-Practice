package Searching;

public class insertionSort {
     public static void insertionSort(int n, int[] arr) {
          for (int i = 1; i < n; ++i) {
               int curr = arr[i];
               int idx = i - 1;
               while (idx >= 0 && arr[idx] > curr) {
                    arr[idx + 1] = arr[idx];
                    --idx;
               }
               arr[idx + 1] = curr;
          }
     }

     public static void main(String[] args) {

     }
}
