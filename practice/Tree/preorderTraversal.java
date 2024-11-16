package Tree;

import java.util.*;

public class preorderTraversal {
     public static class ListNode {
          int val;
          ListNode left;
          ListNode right;

          ListNode(int val) {
               this.left = left;
               this.right = right;
          }
     }

     List<Integer> output = new ArrayList<>();

     public List<Integer> preorder(Node root) {
          if (root == null)
               return output;
          output.add(root.val);
          for (Node child : root.children) {
               preorder(child);
          }
          return output;

     }

     public static void main(String[] args) {

     }
}