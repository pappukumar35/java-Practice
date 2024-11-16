package String;

import java.util.*;

public class sub {
     public static String substr(String str, int si, int ei) {
          String substr = " ";
          for (int i = si; i < ei; i++) {
               substr += str.charAt(i);
          }
          return substr;
     }

     public static void main(String args[]) {
          String substr = "Hello World";
          System.out.println(substr(substr, 0, 4));
     }

}
