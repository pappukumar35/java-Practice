import java.util.*;

public class Copy {
     public static void main(String[] args) {
          int a[] = new int[5];
          int b[] = new int[3];
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the value of five element");
          for (int i = 0; i < 5; i++) {
               a[i] = sc.nextInt();

          }
          System.out.println("first arr value");
          for (int i = 0; i < 5; i++) {
               System.out.println(a[i] + "");
          }
          System.out.println("Second arr value");
          for (int i = 0; i < 3; i++) {
               b[i] = a[i];
               System.out.println(b[i] + " ");
          }

     }
}
