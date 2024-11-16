package pattern2;

import java.util.*;

public class odd_even {

    public static void main(String args[]) {
        int n = '5';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { // even
                    System.out.print("1");

                } else {
                    System.out.println("0");
                }
            }
            System.out.println();
        }
    }
}
