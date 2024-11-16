package Array;

import java.util.Scanner;

public class inputArray {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of the Array");
          int size = sc.nextInt();
          int arr[] = new int[size];
          System.out.println("Enter element of the array");
          for (int i = 0; i < size; i++) {
               arr[i] = sc.nextInt();
          }
          System.out.println("Array element are:");
          for (int j = 0; j < arr.length; j++) {
               System.out.print(arr[j] + " ");
          }
     }
}