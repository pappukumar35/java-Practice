package number;

import java.io.*;
import java.util.*;

public class Small {
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
          int number[] = { 1, 2, 4, 5, 6, 40, 10 };
          int key = 10;
          System.out.println(smallest(number));

     }
}
