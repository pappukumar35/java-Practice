package conditional;

import java.util.Scanner;

public class child {
     public static void main(String[] args) {
          System.out.println("Enter your age number");
          Scanner sc = new Scanner(System.in);
          int age = sc.nextInt();
          if (age > 18) {
               System.out.println("adult");
          } else if (age > 15 && age <= 18) {
               System.out.println("tanney");

          } else if (age <= 15) {
               System.out.println("child");
          }
     }

}
