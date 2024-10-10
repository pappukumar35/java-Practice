package Tree;

public class invertBinaryTree {
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

     public TreeNode invertTree(TreeNode root) {
          if (root == null)
               return null;
          TreeNode left = invertTree(root.left);
          TreeNode right = invertTree(root.right);
          root.left = right;
          root.right = left;

          return root;
     }

     public static void main(String[] args) {

     }
}