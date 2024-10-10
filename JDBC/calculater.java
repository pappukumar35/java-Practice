package JDBC;

import java.util.*;

public class calculater {
     int num;

     public int add(int n1, int n2) {
          return n1 + n2;
     }

     public class Demo {
          public static void main(String[] args) {
               calculater obj = new calculater();
               int r1 = obj.add(3, 4);
               System.out.println(r1);

          }

     }
}