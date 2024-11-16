package number;

import java.io.*;
import java.util.*;

public class largest {
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
          int number[] = { 2, 5, 40, 6 };
          System.out.println(largest(number));
     }
}
