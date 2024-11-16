package Tree;

public class diameterTree {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode next;

          TreeNode(int val) {
               this.val = val;
               this.next = next;
               this.left = left;
               this.right = right;
          }
     }

     int dim = 0;

     public int height(TreeNode root) {
          if (root == null) {
               return 0;
          }
          int lh = height(root.left);
          int rh = height(root.right);
          dim = Math.max(lh + rh, dim);
          return Math.max(lh, rh) + 1;
     }

     public int diameterOfBinaryTree(TreeNode root) {
          if (root == null) {
               return 0;
          }
          int h = height(root);
          return dim;
     }

     public static void main(String[] args) {

     }
}