package Sorting;

import java.io.*;
import java.util.*;

public class prefixSum {
     public static int printprefixSum(int number[]) {
          int n = number.length;
          for (int i = 1; i < number.length; i++) {
               number[i] += number[i - 1];
          }
          return n;
     }

     public static void main(String[] args) {
          int number[] = { 2, 4, 6, 8, 10, 12 };
          printprefixSum(number);

     }
}
