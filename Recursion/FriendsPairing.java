package Recursion;

public class FriendsPairing {
     public static int friendsPairing(int n) {
          if (n == 1 || n == 2) {
               return n;
          }
          return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);

     }

     public static void main(pp[] args) {
          System.out.println(friendsPairing(5));

     }

}
