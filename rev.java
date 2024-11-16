import java.util.*;

public class rev {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your number");
          int n = sc.nextInt();
          for (int i = n; i >= 1; i--) {
               System.out.println(i);
          }
          sc.close();
     }
}
