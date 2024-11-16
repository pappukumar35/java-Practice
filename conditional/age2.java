package conditional;

import java.util.Scanner;

public class age2 {
     public static void main(String[] args) {
          System.out.println("Enter your number");
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          // System.out.println("Enter your number");

          if (num % 2 == 0) {

               System.out.println("Even");
          } else {

               System.out.println("odd");
          }
     }
}
