package Tree;

public class countTreeNodes {
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

     public int countNodes(TreeNode root) {
          if (root == null) {
               return 0;
          }
          int leftAns = countNodes(root.left);
          int rightAns = countNodes(root.right);
          return leftAns + rightAns + 1;
     }

     public static void main(String[] args) {

     }
}