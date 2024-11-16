package Sorting;

import java.io.*;
import java.util.*;
import java.util.Collections;

public class inbuild {
     public static void inbuildSort(int arr[]) {
          for (int i = 0; i < arr.length - 1; i++) {
               int curr = i;
               int prev = i - 1;
               while (prev >= 0 && arr[prev] > arr[curr]) {
                    arr[prev + 1] = arr[prev];
                    prev--;
               }
               arr[prev + 1] = arr[curr];
          }
     }

     public static void printArray(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.print(arr[i] + "  ");
          }
          System.out.println();
     }

     public static void main(String[] args) {
          int arr[] = { 2, 8, 5, 1, 9 };
          Arrays.sort(arr, 0, 3);
          printArray(arr);
          // Arrays.sort(arr, Collection.reverseOrder());
     }
}