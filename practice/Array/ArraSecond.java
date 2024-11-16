package Array;

public class ArraSecond {
     void Example() {
          int[][] arr_1 = new int[10][4];
          int[][] arr = { { 10, 12, 30, }, { 10, 25, 14 }, { 15, 14, 13 } };
          System.out.println(arr[0][0]);
          System.out.println(arr[1][1]);
          System.out.println(arr[2][2]);
          System.out.println(arr[0][0]);
          System.out.println(arr[1][1]);
          System.out.println(arr[2][2]);

     }

     public static void main(String[] args) {
          ArraSecond obj = new ArraSecond();
          obj.Example();

     }
}
