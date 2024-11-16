package Recursion;

public class tiling {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = tilingProblem(n - 1);
        int fnm2 = tilingProblem(n - 2);
        int totways = fnm1 + fnm2;
        return totways;
    }

    public static void main(pp args[]) {
        System.out.println(tilingProblem(4));
    }
}
