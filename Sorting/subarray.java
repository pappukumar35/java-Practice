package Sorting;

import java.io.*;
import java.util.*;

public class subarray {
     public static void printSubarray(int number[]) {
          int ts = 0;
          for (int i = 0; i < number.length; i++) {
               int start = i;
               for (int j = i; j < number.length; j++) {
                    int end = j;
                    for (int k = i; k <= j; k++) {
                         System.out.print(number[k] + " ");
                    }
                    System.out.println();
                    ts++;
               }
          }
          System.out.println("total subarray:=" + ts);
     }

     public static void main(String args[]) {
          int number[] = { 2, 4, 8, 10, 12, 14 };
          printSubarray(number);
     }
}
