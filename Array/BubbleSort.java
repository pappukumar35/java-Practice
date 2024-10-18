package Array;

public class BubbleSort {
     public static void BubbleSort(int arr[], int n) {
          boolean flag;
          for (int i = 0; i < n - 1; i++) {
               flag = false;
               for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                         flag = true;
                    }
               }
               if (flag == false) {
                    break;
               }
               return;
          }
     }

     public static void main(String[] args) {

     }
}
