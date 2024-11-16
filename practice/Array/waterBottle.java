package Array;

public class waterBottle {
     public int newWaterBottle(int numBottle, int numExchange) {
          int ans = numBottle;
          while (numBottle >= numExchange) {
               int numBottle = numBottle / numExchange;
               int resBottle = numBottle % numExchange;
               ans = ans + numBottle;
               int newWaterBottle = numBottle + resBottle;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}