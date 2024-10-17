package condation;

import java.util.*;

public class invertde_star {
     public static void main(String[] args) {
          // System.out.println("Enter your number");
          // Scanner sc = new Scanner(System.in);
          // int n = sc.nextInt();
          for (int i = 1; i <= 5; i++) {
               for (int j = 1; j <= (5 - i + 1); j++) {
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}
