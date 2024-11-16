package Sorting;

import java.io.*;
import java.util.*;

public class Insertion {
     public static void InsertionSort(int arr[]) {
          for (int i = 0; i < arr.length - 1; i++) {
               int curr = i;
               int prev = i - 1;
               while (prev >= 0 && arr[prev] > arr[curr]) {
                    arr[prev + 1] = arr[prev];

               }
               arr[prev + 1] = arr[curr];
          }
     }

     public static void printArray(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i] + "");
          }
          System.out.println();
     }

     public static void main(String[] args) {
          int arr[] = { 2, 5, 3, 8, 6, 9, 1 };
          InsertionSort(arr);
          printArray(arr);
     }

}
