package number;

import java.util.*;
import java.io.*;

public class binaryTOdec {
     public static void binaryTOdec(int binNum) {
          int pow = 0;
          int decNum = 0;
          while (binNum > 0) {
               int lastDigit = binNum % 10;
               decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
               pow++;
               binNum = binNum / 10;

          }
          System.out.println("decNum of" + binNum + "=" + decNum);
     }

     public static void main(String args[]) {
          binaryTOdec(10);

     }

}