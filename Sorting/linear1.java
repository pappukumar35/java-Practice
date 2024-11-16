package Sorting;

import java.io.*;
import java.util.*;

public class linear1 {
     public static int linearSearch(int number[], int key) {
          for (int i = 0; i < number.length; i++) {
               if (number[i] == key) {
                    return i;
               }
          }
          return -1;
     }

     public static void main(String args[]) {
          int number[] = { 10, 20, 15, 40, 13, 60 };
          int key = 40;
          int index = linearSearch(number, key);
          System.out.println(linearSearch(number, key));
     }
}