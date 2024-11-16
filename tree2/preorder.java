package tree2;

public class preorder {
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

     static class BinaryTree {
          static int idx = -1;

          public static Node buildtree(int nodes[]) {
               idx++;
               if (nodes[idx] == -1) {
                    return null;
               }
               Node newNode = new Node(nodes[idx]);
               newNode.left = buildtree(nodes);
               newNode.right = buildtree(nodes);
               return newNode;
          }
     }

     public static void preorder(Node root) {
          if (root == null) {
               return;
          }
          System.out.print(root.data + " ");
          preorder(root.left);
          preorder(root.right);

     }

     public static void main(String[] args) {
          int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1 };
          BinaryTree tree = new BinaryTree();
          Node root = tree.buildtree(nodes);
          tree.preorder(root);
     }
}
