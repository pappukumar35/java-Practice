package Array;

import javax.sound.sampled.SourceDataLine;

public class length {
     void multiple() {
          int[][] arr = { { 20, 10, 50 }, { 10, 20, 12 }, { 30, 12, 20 } };
          float[][] weight = new float[10][2];
          String[][] name = { { " pappu" }, { "vicky" }, { "aditya " } };
          System.out.println(arr.length);
          System.out.println(weight.length);
          System.out.println(name.length);

     }

     public static void main(String[] args) {
          length obj = new length();
          obj.multiple();

     }
}
