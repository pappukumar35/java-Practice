package Tree;

public class invertTree {
     public static class TreeNode {
          int data;
          TreeNode left;
          TreeNode right;
          TreeNode next;

          TreeNode(int data) {
               this.data = data;
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
          TreeNode root = new TreeNode(4);
          root.left = new TreeNode(2);
          root.right = new TreeNode(7);
          root.left.left = new TreeNode(1);
          root.left.right = new TreeNode(3);
          root.right.left = new TreeNode(6);
          root.right.right = new TreeNode(9);

     }

}
