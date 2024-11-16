package Tree3;

public class validNode {
     static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               this.right = right;
               this.left = left;
          }

     }

     // inorder
     public static void inorder(Node root) {
          if (root == null) {
               return;
          }
          inorder(root.left);
          System.out.print(root.data + " ");
          inorder(root.right);
     }

     // insert
     public static Node insert(Node root, int val) {
          if (root == null) {
               root = new Node(val);
               return root;
          }
          if (root.data > val) {
               root.left = insert(root.left, val);
          } else {
               root.right = insert(root.right, val);
          }
          return root;
     }

     // isValidBST
     public static boolean isValidBST(Node root, Node min, Node max) {
          if (root == null) {
               return true;
          }
          if (min != null && root.data <= min.data) {
               return false;
          } else if (max != null && root.data >= max.data) {
               return false;
          }
          return isValidBST(root.left, min, root) && isValidBST(root.right, max, root);
     }

     public static void main(String[] args) {
          int val[] = { 8, 5, 3, 6, 10, 11, 14 };
          Node root = null;
          for (int i = 0; i < val.length; i++) {
               root = insert(root, val[i]);
          }
          inorder(root);
          System.out.println();
          if (isValidBST(root, null, null)) {
               System.out.println("valid");
          } else {
               System.out.println("not valid");
          }
     }
}