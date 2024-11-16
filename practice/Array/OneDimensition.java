package Array;

import java.util.*;

public class OneDimensition {
     void multi() {
          int[][] arr = new int[10][8];
          float[][] weight = new float[10][2];
          String[][] name = { { "pappu" }, { "vicky" }, { "rohit panday" }, { "usha" } };
          System.out.println(arr.length);
          System.out.println(weight.length);
          System.out.println(name.length);
     }

     public static void main(String[] args) {
          OneDimensition obj = new OneDimensition();
          obj.multi();
     }
}
