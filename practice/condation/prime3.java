package condation;

import java.util.*;

public class prime3 {
     public static void main(String[] args) {
          System.out.println("Enter your number");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          if (n % 2 == 0 && n % 2 != 0) {
               System.out.println("n is prime");
          } else {
               System.out.println("n is not prime");
          }

     }
}
