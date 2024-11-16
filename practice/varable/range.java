package varable;

import java.util.*;

public class range {
     public static void main(String[] args) {
          System.out.println("Enter your number");
          Scanner sc = new Scanner(System.in);
          int range = sc.nextInt();
          int counter = 1;
          while (counter <= range) {
               System.out.println(counter);
               counter++;
          }
     }
}
