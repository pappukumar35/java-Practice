package Tree3;

public class printInRange {
     static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
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

     public static void printInRange(Node root, int k1, int k2) {
          if (root == null) {
               return;
          }
          if (root.data >= k1) {
               printInRange(root.left, k1, k2);
               System.out.print(root.data + " ");
               printInRange(root.right, k1, k2);
          } else if (root.data > k1) {
               printInRange(root.left, k1, k2);
          } else {
               printInRange(root.right, k1, k2);
          }
     }

     public static void main(String[] args) {
          int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
          Node root = null;
          for (int i = 0; i < val.length; i++) {
               root = insert(root, val[i]);
          }
          inorder(root);
          System.out.println();
          printInRange(root, 5, 12);

     }
}
