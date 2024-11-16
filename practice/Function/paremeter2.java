package Function;

import java.util.Scanner;

public class paremeter2 {
     public static void calculatedSum(int a, int b) {
          int sum = a + b;
          System.out.println(sum);
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          calculatedSum(a, b);

     }
}
