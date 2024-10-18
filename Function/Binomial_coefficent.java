package Function;

public class Binomial_coefficent {
     public static int factorial(int f) {
          int f = 1;
          for (int i = 1; i <= n; i++) {
               f = f * i;
          }
          return f;

     }

     public static int Binomial_coefficent(int n, int r) {
          int fact_n = factorial(n);
          int fact_r = factorial(r);
          int fact_nmr = factorial(n - r);
          int Binomial_coefficent = fact_n / (fact_r - fact_nmr);
          return Binomial_coefficent;

     }

     public static void main(String[] args) {
          System.out.println(factorial(4));
          System.out.println(Binomial_coefficent(7, 4));

     }
}
