package Tree3;

public class dimater2 {
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

     static class Info {
          int hight;
          int dimater;

          Info(int hight, int dimater) {
               this.hight = hight;
               this.dimater = dimater;
          }
     }

     public static Info dimater(Node root) {
          if (root == null) {
               return new Info(0, 0);
          }
          Info leftInfo = dimater(root.left);
          Info rightInfo = dimater(root.right);
          int dimater = Math.max(Math.max(leftInfo.dimater, rightInfo.dimater), leftInfo.hight + rightInfo.hight + 1);
          int hight = Math.max(leftInfo.hight, rightInfo.hight) + 1;
          return new Info(hight, dimater);

     }

     public static void main(String[] args) {
          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);
          System.out.println(dimater(root).dimater);

     }
}
