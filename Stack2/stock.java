package Stack2;

import java.util.Stack;
import java.util.*;

public class stock {
     public static void Stocksspan(int Stocks[], int span[]) {
          Stack<Integer> s = new Stack<>();
          Stocks[0] = 1;
          s.push(0);
          for (int i = 1; i < Stocks.length; i++) {
               int currprice = Stocks[i];
               while (!s.isEmpty() && currprice > Stocks[s.peek()]) {
                    s.pop();
               }
               if (s.isEmpty()) {
                    Stocks[i] = i + 1;
               } else {
                    int prevHigh = s.peek();
                    span[i] = i - prevHigh;
               }
               s.push(i);
          }
     }

     public static void main(String[] args) {
          // Stack<Integer> s = new Stack<>();
          int Stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
          int span[] = new int[Stocks.length];
          // Stocksspan(Stocks, span);
          Stocksspan(Stocks, span);
          for (int i = 0; i < span.length; i++) {
               System.out.println(span[i] + " ");
          }
     }
}
