package Sorting;

import java.io.*;
import java.util.*;

public class Binary2 {
     public static int binarySearch(int number[], int key) {
          int start = 0;
          int end = number.length - 1;
          while (start < end) {
               int mid = (start + end) / 2;
               if (number[mid] == key) {
                    return mid;
               }
               if (number[mid] < key) {
                    start = mid + 1;
               } else {
                    end = mid - 1;
               }
          }
          return -1;
     }

     public static void main(String args[]) {
          int number[] = { 2, 8, 10, 6, 12, 9 };
          System.out.println(binarySearch(number, 10));
     }
}
