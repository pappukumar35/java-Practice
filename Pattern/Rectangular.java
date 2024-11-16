package Pattern;

public class Rectangular {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || j == n - 1 || i == n - 1) {
                    System.out.println("p");
                } else {
                    System.out.println(" ");
                }

            }
            System.out.println();
        }
    }
}