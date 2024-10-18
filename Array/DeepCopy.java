public class DeepCopy {
     public static void main(String[] args) {
          int arr[] = { 1, 2, 3, 4, 5 };
          System.out.println("The value is the origin arr");
          for (int i : arr) {
               System.out.println(i);
          }
          System.out.println("The clone arr");
          int carr[] = arr.clone();
          for (int j : carr) {
               System.out.println(j);
          }
          System.out.println("are the value is same");
          System.out.println("carr==arr");
     }
}
