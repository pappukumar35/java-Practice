package Tree3;

public class Mirror {
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

     // mirror
     public static Node mirror(Node root) {
          if (root == null) {
               return null;
          }
          Node leftmirror = mirror(root.left);
          Node rightmirror = mirror(root.right);
          root.left = rightmirror;
          root.right = leftmirror;
          return root;
     }

     // preorder
     public static void preorder(Node root) {
          if (root == null) {
               return;
          }
          System.out.print(root.data + " ");
          preorder(root.left);
          preorder(root.right);
     }

     public static void main(String[] args) {
          Node root = new Node(8);
          root.left = new Node(5);
          root.right = new Node(10);
          root.left.left = new Node(3);
          root.left.right = new Node(6);
          root.right.right = new Node(11);
          root = mirror(root);
          preorder(root);
     }
}