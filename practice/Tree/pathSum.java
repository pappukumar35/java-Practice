package Tree;

public class pathSum {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int val) {
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     public boolean hasPathSum(TreeNode root, int targetSum) {
          if (root == null) {
               return false;
          }
          if (root.left == null && root.right == null && root.val == targetSum) {
               return true;
          }
          boolean ans1 = hasPathSum(root.left, targetSum - root.val);
          boolean ans2 = hasPathSum(root.right, targetSum - root.val);
          return ans1 || ans2;
     }

     public static void main(String[] args) {

     }
}