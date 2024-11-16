package Tree3;

public class minimum_distance {
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

     public static Node lca(Node root, int n1, int n2) {
          if (root == null) {
               return null;
          }
          if (root.data == n1 || root.data == n2) {
               return root;
          }
          Node leftlca = lca(root.left, n1, n2);
          Node rightlca = lca(root.right, n1, n2);
          if (rightlca == null) {
               return leftlca;
          }
          if (leftlca == null) {
               return rightlca;
          }
          return root;
     }

     public static int lcaDist(Node root,int n){
          if(root==null){
               return -1;
          }
          if(root.data==n){
               return 0;
          }
          int leftDist=lcaDist(root.left,n);
          int rightDist=lcaDist(root.right,n);
          if(leftDist==-1&&rightDist==-1){
               return -1;
          }
          else if(leftDist +1){
               return rightDist+1;
          }
          esle{
               return leftDist +1;
          }
     }

     public static int minDist(Node root, int n1, int n2) {
          Node lca = lca(root, n1, n2);
          int Dist1 = lcaDist(lca, n1);
          int Dist2 = lcaDist(lca, n2);
          return lcaDist1 + lcaDist2;
     }

     public static void main(String[] args) {
          Node root = new Node(1);
          root.left = new Node(2);
          root.right = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);
          root.right.left = new Node(6);
          root.right.right = new Node(7);
          int n1 = 4, n2 = 7;
          System.out.println(minDist(root, n1, n2));

     }
}