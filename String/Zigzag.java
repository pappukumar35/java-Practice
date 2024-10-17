package String;

public class Zigzag {
     public String convert(String s, int numRows) {
          if (numRows == 1)
               return s;
          StringBuilder res = new StringBuilder();
          int n = s.length();
          int cycle = 2 * (numRows - 1);
          for (int i = 0; i < numRows; i++) {
               for (int j = i; j < n; j += cycle) {
                    res.append(s.charAt(j));
                    int diag = j + cycle - 2 * i;
                    if (i > 0 && i < numRows - 1 && diag < n) {
                         res.append(s.charAt(diag));
                    }
               }

          }
          return res.toString();
     }

     public static void main(String[] args) {

     }
}