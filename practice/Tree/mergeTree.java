package Tree;

public class mergeTree {
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

     public TreeNode mergeTree(TreeNode root1, TreeNode root2) {
          if (root1 == null && root2 == null) {
               return null;
          } else if (root2 == null) {
               return root1;
          } else if (root1 == null) {
               return root2;
          }
          TreeNode root = new TreeNode(root1.val + root2.val);
          root.left = mergeTree(root1.left, root2.left);
          root.right = mergeTree(root1.right, root2.right);
          return root;
     }

     public static void main(String[] args) {

     }
}
