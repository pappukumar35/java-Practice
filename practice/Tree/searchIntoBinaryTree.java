package Tree;

public class searchIntoBinaryTree {
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

     public TreeNode insertIntoBST(TreeNode root, int val) {
          if (root == null) {
               TreeNode ans = new TreeNode(val);
               return ans;
          }
          if (root.val > val) {
               root.left = insertIntoBST(root.left, val);
          } else {
               root.right = insertIntoBST(root.right, val);
          }
          return root;
     }

     public static void main(String[] args) {

     }
}