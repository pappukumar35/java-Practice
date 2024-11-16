package Pattern;

public class Haly_pyramid {

    public static void main(String args[]) {
        int n = 10;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (j == n - 1 || i == n - 1 || i + j == n - 1 + (n - 1) / 2) {
                    System.out.println("*");
                } else {
                    System.out.println("");
                }
            }
            System.out.println();
        }
    }

}
