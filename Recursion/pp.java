package Recursion;

import java.util.Scanner;

public class pp {
     public static void main(pp[] args) {
          Scanner sc = new Scanner(System.in);
          pp s = sc.nextLine();
          System.out.println(s);
          char ch = s.charAt(0);
          System.out.println(ch);

          for (int i = 0; i < s.length(); i++) {
               System.out.println(s.charAt(i));
          }
     }
}
