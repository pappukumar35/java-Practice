package Tree3;

import java.util.*;

public class subTree {
     static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               this.left = null;
               this.right = null;
          }
     }

     public static boolean isIdentical(Node node, Node subRoot) {
          if (node == null && subRoot == null) {
               return true;
          } else if (node == null || subRoot == null || node.data != subRoot.data) {
               return false;
          }
          return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
     }

     public static boolean issubTree(Node root, Node subRoot) {
          if (root == null) {
               return false;
          }
          if (isIdentical(root, subRoot)) {
               return true;
          }
          return issubTree(root.left, subRoot) || issubTree(root.right, subRoot);
     }

     public static void main(String[] args) {
          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);

          // subRoot
          Node subRoot = new Node(2);
          subRoot.left = new Node(4);
          subRoot.right = new Node(5);

          System.out.println(issubTree(root, subRoot)); // Output should be true
     }
}
