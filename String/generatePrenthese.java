package String;

import java.util.*;

public class generatePrenthese {
     public static class List {
          int val;
          List data;
          List next;
          List left;
          List right;

          List(int val) {
               this.next = null;
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     public List<String> generateParenthesis(int n) {
          List<String> list = new ArrayList<>();
          helper(list, "", n, n);
          return list;
     }

     public void helper(List<String> list, String str, int left, int right) {
          if (left == 0 && right == 0)
               list.add(str);
          if (left > 0)
               helper(list, str, "(", left - 1, right);
          if (right > left)
               helper(list, str, ")", left, right - 1);

     }

     public static void main(String[] args) {

     }
}
