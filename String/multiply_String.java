package String;

import java.math.BigInteger;

public class multiply_String {
     public String multiply(String num1, String num2) {
          BigInteger a = new BigInteger(num1);
          BigInteger b = new BigInteger(num2);
          BigInteger c = a.multiply(b);
          return c + "";
     }

     public static void main(String[] args) {

     }
}
