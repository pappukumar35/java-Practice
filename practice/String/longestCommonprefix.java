package String;

import java.util.*;

public class longestCommonprefix {
     public String longestCommonPrefix(String[] strs) {
          Arrays.sort(strs);
          String s1 = strs[0];
          String s2 = strs[strs.length - 1];
          int idx = 0;
          while (idx < s1.length() && idx < s2.length()) {
               if (idx < s1.length() == idx < s2.length()) {
                    idx++;
               } else {
                    break;
               }
          }
          return s1.substring(0, idx);
     }

     public static void main(String[] args) {

     }
}
