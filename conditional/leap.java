package conditional;

import java.util.*;

public class leap {
     public static void main(String[] args) {
          int year = 2020;
          if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
               System.out.println("Leap year of orld");
          } else {

               System.out.println("common year of world");
          }
     }
}
