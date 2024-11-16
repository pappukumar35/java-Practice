package Sorting;

import java.io.*;
import java.util.*;

public class Selection {
     public static void Selectionsort(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               int minPos = i;
               for (int j = i + 1; j < arr.length - 1; j++) {
                    minPos = j;
                    int temp = arr[minPos];
                    arr[minPos] = arr[i];
                    arr[i] = temp;
               }
          }
     }

     public static void printArray(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               System.out.println(arr[i] + "");
          }
          System.out.println();
     }

     public static void main(String[] args) {
          int arr[] = { 2, 5, 8, 0, 3, 9, 10, 7 };
          Selectionsort(arr);
          printArray(arr);

     }

}
