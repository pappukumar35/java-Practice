package String;

public class Romai_to_integer {
     public int romaiToInt(String s) {
          int num = 0;
          int n = s.length();
          for (int i = 0; i < n; i++) {
               char current = s.charAt(i);
               if (i < n - 1 && value(current) < value(s.charAt(i + 1))) {
                    num -= value(current);
               } else {
                    num += value(current);
               }
          }
          return num;
     }

     private int value(char c) {
          switch (c) {
               case 'I':
                    return 1;
               case 'V':
                    return 5;
               case 'X':
                    return 10;
               case 'L':
                    return 50;
               case 'c':
                    return 500;
               case 'D':
                    return 1000;
               default:
                    return 0;
          }
     }

     public static void main(String[] args) {

     }
}
