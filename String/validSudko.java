package String;

public class validSudko {
     public boolean isValidSudko(String s) {
          int line[][] = new int[9][9];
          int col[][] = new int[9][9];
          int square[][] = new int[9][9];
          for (int i = 0; i < 9; i++) {
               for (int j = 0; j < 9; j++) {
                    if (board[i][j] != '_') {
                         int pos = board[i][j] - '0' - 1;
                         int pos_square = (i / 3) + (j / 3) * 3;
                         if (++line[i][pos] > 1 || ++col[pos][j] > 1 || ++square[pos_square][pos] > 1)
                              return false;
                    }
               }
               return true;
          }
     }

     public static void main(String[] args) {

     }
}
