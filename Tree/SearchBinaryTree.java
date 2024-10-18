package Tree;

public class SearchBinaryTree {
     public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode next;

          TreeNode(int val) {
               this.next = null;
               this.left = left;
               this.right = right;
          }
     }

     public TreeNode searchBST(TreeNode root, int val) {
          TreeNode temp = root;
          while (temp != null) {
               if (temp.val == val) {
                    break;
               } else if (temp.val > val) {
                    temp = temp.left;
               } else {
                    temp = temp.right;
               }
          }
          return temp;
     }

     public static void main(String[] args) {

     }
}