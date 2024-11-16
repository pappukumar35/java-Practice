package Tree3;

public class searcgNode {
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

     // search
     public static boolean search(Node root, int key) {
          if (root == null) {
               return false;
          }
          if (root.data == key) {
               return true;
          }
          if (root.data > key) {
               return search(root.left, key);
          } else {
               return search(root.right, key);
          }
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

     // inorder
     public static void inorder(Node root) {
          if (root == null) {
               return;
          }
          inorder(root.left);
          System.out.print(root.data + " ");
          inorder(root.right);
     }

     public static void main(String[] args) {
          int val[] = { 5, 1, 3, 4, 2, 7 };
          Node root = null;
          for (int i = 0; i < val.length; i++) {
               root = insert(root, val[i]);
          }
          inorder(root);
          System.out.println();
          if (search(root, 1)) {
               System.out.println("found");
          } else {
               System.out.println("no found");
          }
     }
}
