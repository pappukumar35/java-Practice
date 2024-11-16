package Array;

public class SelectionSort {
     public static void SelectionSort(int arr[], int n) {
          int minVal;
          for (int i = 0; i < n - 1; i++) {
               minVal = i;
               for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minVal]) {
                         minVal = j;
                    }
                    int temp = arr[minVal];
                    arr[minVal] = arr[i];
                    arr[i] = temp;
               }
          }
     }

     public static void main(String[] args) {

     }
}
