package Tree;

import java.util.*;

public class BinaryRightSide {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode next;

          TreeNode(int val) {
               this.val = val;
               this.right = right;
               this.left = left;
               this.next = null;
          }
     }

     public List<Integer> rightSideView(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
          helper(root, ans, 0);
          return ans;
     }

     public void helper(TreeNode root, List<Integer> ans, int level) {
          if (root == null) {
               return;
          }
          if (ans.size() == level) {
               ans.add(root.val);
          }
          helper(root.right, ans, level + 1);
          helper(root.left, ans, level + 1);

     }

     public static void main(String[] args) {

     }
}