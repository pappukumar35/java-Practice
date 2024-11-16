package condation;

public class chaterPatter {
     public static void main(String[] args) {
          int n = 5;
          char ch = 'A';
          for (int i = 1; i <= 5; i++) {
               for (int j = 1; j <= i; j++) {
                    System.out.print(ch);
                    ch++;
               }
               System.out.println();
          }
     }
}
