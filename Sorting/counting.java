package Sorting;

import java.io.*;
import java.util.*;

public class counting {
     public static void countingSort(int arr[]) {
          int largest = Integer.MIN_VALUE;
          for (int i = 0; i < arr.length; i++) {
               largest = Math.max(largest, arr[i]);
          }
          int count[] = new int[largest + 1];
          for (int i = 0; i < arr.length; i++) {
               count[arr[i]]++;
          }
          int j = 0;
          for (int i = 0; i < arr.length; i++) {
               while (count[i] > 0) {
                    arr[j] = i;
                    j++;
                    count[i]--;
               }
          }
     }

     public static void printSort(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + "");
          }
          System.out.println();
     }

     public static void main(String[] args) {
          int arr[] = { 2, 5, 3, 6, 8, 1 };
          countingSort(arr);
          printSort(arr);

     }

}
