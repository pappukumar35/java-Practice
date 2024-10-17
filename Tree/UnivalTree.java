package Tree;

public class UnivalTree {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode next;

          TreeNode(int val) {
               this.val = val;
               this.left = left;
               this.right = right;
               this.next = null;
          }
     }

     public boolean helper(TreeNode root, int val) {
          if (root == null) {
               return true;
          }
          if (root == null) {
               return false;
          }
          boolean leftAns = helper(root.left, val);
          boolean rightAns = helper(root.right, val);

          return leftAns && rightAns;
     }

     public boolean isUnivalTree(TreeNode root) {
          return helper(root, root.val);
     }

     public static void main(String[] args) {

     }
}
