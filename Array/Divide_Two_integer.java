package Array;

public class Divide_Two_integer {
     public int divide(int dividend, int divisor) {
          if (divisor == 0) {
               throw new ArithmeticException("divisor by zero  is not allow");
          }
          if (dividend == Integer.MIN_VALUE && divisor == -1) {
               return Integer.MAX_VALUE;
          }
          return dividend / divisor;
     }

     public static void main(String[] args) {

     }
}