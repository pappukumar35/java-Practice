package Tree3;

import java.util.*;

public class deleteNode {
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

     // delete
     public static Node delete(Node root, int val) {
          if (root == null) {
               return null;
          }
          if (root.data < val) {
               root.right = delete(root.right, val);
          } else if (root.data > val) {
               root.left = delete(root.left, val);
          } else {
               // Node to be deleted found
               if (root.left == null && root.right == null) {
                    return null; // No children
               }
               if (root.left == null) {
                    return root.right; // One child (right)
               }
               if (root.right == null) {
                    return root.left; // One child (left)
               }
               // Two children
               Node IS = findNodeSuccessor(root.right);
               root.data = IS.data;
               root.right = delete(root.right, IS.data);
          }
          return root;
     }

     public static Node findNodeSuccessor(Node root) {
          while (root.left != null) {
               root = root.left;
          }
          return root;
     }

     public static void main(String[] args) {
          int val[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
          Node root = null;
          for (int i = 0; i < val.length; i++) {
               root = insert(root, val[i]);
          }
          inorder(root);
          System.out.println();
          root = delete(root, 1);
          inorder(root);
          System.out.println();
     }
}
