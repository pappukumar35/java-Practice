package conditional;

import java.util.Scanner;
import java.util.*;

import java.util.Scanner;

public class prime2 {
     public static void main(String[] args) {
          System.out.println("Enter your number:");
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
          String output = (num % 2 == 0) ? "even number" : "odd number";
          System.out.println(output);
     }
}
