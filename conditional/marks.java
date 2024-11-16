package conditional;

import java.util.*;

public class marks {
     public static void main(String[] args) {
          int mark = 100;
          if (mark <= 40) {
               System.out.println("fail");
          } else if (mark >= 50) {
               System.out.println("D grade");
          } else if (mark <= 65) {
               System.out.println("C grade");
          } else if (mark <= 80) {
               System.out.println("B grade");
          } else if (mark <= 100) {
               System.out.println("A grade");
          }
     }

}
