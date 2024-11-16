package Sorting;

import java.io.*;
import java.util.*;

public class small2 {
     public static int smallest(int number[]) {
          int smallest = Integer.MAX_VALUE;
          for (int i = 0; i < number.length; i++) {
               if (smallest > number[i]) {
                    smallest = number[i];
               }
          }
          return smallest;
     }

     public static void main(String[] args) {
          int number[] = { 105, 100, 40, 105, 20, 300, 112 };
          int index = smallest(number);
          System.out.println(smallest(number));

     }
}
