package Recursion;

import java.util.*;

public class Duplicate {
     static void removeDuplicate(String Str, int idx, StringBuilder newStr, boolean map[]) {
          if (idx == Str.length()) {
               System.out.println(newStr);
               return;
          }
          char currChar = Str.charAt(idx);
          if (map[currChar - 'a'] == true) {
               removeDuplicate(Str, idx + 1, newStr, map);
          } else {
               map[currChar - 'a'] = true;
               removeDuplicate(Str, idx + 1, newStr.append(currChar), map);
          }
     }

     public static void main(String[] args) {
          String Str = "HelloWorld";
          boolean[] map = new boolean[26]; // Initialize map array
          removeDuplicate(Str, 0, new StringBuilder(), map);
     }
}
