package Sorting;

import java.io.*;
import java.util.*;

public class large2 {
     public static int largest(int number[]) {
          int largest = Integer.MIN_VALUE;
          for (int i = 0; i < number.length; i++) {
               if (largest < number[i]) {
                    largest = number[i];
               }
          }
          return largest;
     }

     public static void main(String[] args) {
          int number[] = { 2, 4, 8, 12, 10 };
          System.out.println(largest(number));

     }
}
