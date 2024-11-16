package Array;

public class Big {
     public static void main(String[] args) {
          int a = 10, b = 15, c = 20;

          // Compare a, b, and c
          if (a > b && a > c) {
               System.out.println(a + " is the greatest");
          } else if (b > c) {
               System.out.println(b + " is the greatest");
          } else {
               System.out.println(c + " is the greatest");
          }
     }
}
