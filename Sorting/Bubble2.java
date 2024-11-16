package Sorting;

import java.io.*;
import java.util.*;

public class Bubble2 {
     public static void BubbleSort(int arr[]) {
          for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                         int temp = arr[j];
                         arr[j] = arr[j + 1];
                         arr[j + 1] = temp;
                    }
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
          int arr[] = { 2, 5, 8, 0, 1, 10, 6 };
          BubbleSort(arr);
          printArray(arr);
     }

}
