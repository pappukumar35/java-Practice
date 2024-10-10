package Tree;

public class lowestCommonAncester {
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

     public TreeNode lowestCommonAncester(TreeNode root, TreeNode p, TreeNode q) {
          if (root == null) {
               return null;
          }
          TreeNode temp = root;
          while (temp != null) {
               if (temp.val > p.val && temp.val > q.val) {
                    temp = temp.left;
               } else if (temp.val < p.val && temp.val < q.val) {
                    temp = temp.right;
               } else {
                    break;
               }
          }
          return temp;
     }

     public static void main(String[] args) {

     }
}