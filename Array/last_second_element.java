import java.util.*;

public class last_second_element {
     static int findmax(int arr[]) {
          int max = Integer.MAX_VALUE;
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] > max) {
                    max = arr[i];
               }
          }
          return max;
     }

     static int secondmax(int arr[]) {
          int max = findmax(arr);
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] == max) {
                    arr[i] = Integer.MIN_VALUE;
                    int secondmax = findmax(arr);
               }
          }
          return secondmax(arr);
     }

     public static void main(String[] args) {
          // int arr[] = { 1, 23, 10, 42, 15, 20 };
          // System.out.println();
          Scanner sc = new Scanner(System.in);

          System.out.println("Enter your arr size");
          int n = sc.nextInt();
          for (int i = 0; i < n; i++) {
               int arr[] = new int[n];
               arr[i] = sc.nextInt();

               System.out.println(secondmax(arr));
          }

     }
}
