package varable;

import java.util.*;

public class sum2 {
     public static void main(String[] args) {
          System.out.println("Enter your number");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum = 0;
          int i = 1;
          for (int i = 1; i <= n; i++) {
               sum = sum + 1;
               i++;
          }
          System.out.println(sum);
     }
}
