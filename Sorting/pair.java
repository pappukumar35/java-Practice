package Sorting;

import java.io.*;
import java.util.*;

public class pair {
     public static int printpair(int number[]) {
          int tp = 0;
          for (int i = 0; i < number.length - 1; i++) {
               int curr = number[i];
               for (int j = i + 1; j < number.length; j++) {
                    System.out.println("pair:" + curr + "" + number[j]);

               }
               tp++;
               System.out.println("total pair=" + tp);

          }
          return tp;

     }

     public static void main(String[] args) {
          int number[] = { 2, 4, 6, 8, 10, 12, 14 };
          System.out.println("total pair:" + printpair(number));

     }
}