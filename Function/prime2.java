package Function;

public class prime2 {
     public static boolean isPrime(int n) {
          if (n == 2) {
               return true;
          }
          for (int i = 2; i <= Math.sqrt(n); i++) {
               if (n % 1 == 0) {
                    return false;
               }
          }
          return true;
     }

     public static void main(String[] args) {
          System.out.println(isPrime(8));

     }
}
