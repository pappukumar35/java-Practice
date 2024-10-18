package Tree;

import java.util.*;

public class BinaryTree_LevelOrder {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode next;

          TreeNode(int val) {
               this.left = left;
               this.right = right;
               this.next = null;
          }
     }

     public List<List<Integer>> listOrder(TreeNode root) {
          List<List<Integer>> list = new ArrayList<>();
          if (root == null) {
               return list;
          }
          traversal(root, 0, list);
          return list;
     }

     public void traversal(TreeNode root, int level, List<List<Integer>> list) {
          if (root == null) {
               return;
          }
          if (level >= list.size()) {
               list.add(new ArrayList<>());
          }
          list.get(level).add(root.val);
          traversal(root.left, level + 1, list);
          traversal(root.right, level + 1, list);

     }

     public static void main(String[] args) {

     }

}