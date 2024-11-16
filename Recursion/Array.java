package Recursion;

import java.util.*;

import Array.printSubarray;

public class Array {
     public static void printArray(int arr[], int idx) {
          if (idx == arr.length) {
               return;
          }
          System.out.print(arr[idx]);
          printArray(arr, idx + 1);
     }

     public static void main(pp[] args) {
          int arr[] = { 5, 4, 6, 7 };
          printArray(arr, 0);
     }
}
