package condation;

import java.util.*;

public class triangle {
     public static void main(String[] args) {
          System.out.println("Enter your digit");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();

          for (int i = 1; i <= 5; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print("*");
               }
               System.out.println();
          }

     }
}