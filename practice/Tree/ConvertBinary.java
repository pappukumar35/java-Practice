package Tree;

public class ConvertBinary {
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

     public TreeNode sortedArrayToBST(int[] nums) {
          return helper(nums, 0, nums.length - 1);

     }

     public TreeNode helper(int[] nums, int start, int end) {
          if (start > end) {
               return null;
          }
          int mid = (start + end) / 2;
          TreeNode root = new TreeNode(nums[mid]);
          root.left = helper(nums, start, mid - 1);
          root.right = helper(nums, mid + 1, end);

          return root;
     }

     public static void main(String[] args) {

     }
}
