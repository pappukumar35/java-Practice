package Searching;

public class reverse {
     public static void main(String[] args) {
          int n = 10899;
          while (n > 0) {
               int lastDight = n % 10;
               System.out.print(lastDight + "");
               n = n / 10;

          }
          System.out.println();
     }
}
