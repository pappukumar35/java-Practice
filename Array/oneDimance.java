package Array;

public class oneDimance {
     void multiple() {
          int[][] arr_1 = new int[5][3];
          int[][] arr = { { 50, 20, 10 }, { 50, 42, 12 }, { 25, 12, 10 } };
          System.out.println(arr[0][0]);
          System.out.println(arr[1][1]);
          System.out.println(arr[2][2]);
          System.out.println(arr[0][0]);
          System.out.println(arr[1][1]);
          System.out.println(arr[2][2]);
     }

     public static void main(String[] args) {
          oneDimance obj = new oneDimance();
          obj.multiple();
     }
}
