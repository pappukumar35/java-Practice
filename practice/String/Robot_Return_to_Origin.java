package String;

public class Robot_Return_to_Origin {
     public boolean judigeCircle(String moves) {
          int upward = 0;
          int down = 0;
          int left = 0;
          int right = 0;
          for (int i = 0; i <= moves.length(); i++) {
               if (moves.charAt(i) == 'U') {
                    upward++;
               } else if (moves.charAt(i) == 'D') {
                    down++;
               } else if (moves.charAt(i) == 'L') {
                    left++;
               } else if (moves.charAt(i) == 'R') {
                    right++;
               }
          }
          return upward == down && left == right;
     }

     public static void main(String[] args) {

     }
}
