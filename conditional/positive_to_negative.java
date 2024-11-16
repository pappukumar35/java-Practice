package conditional;

import java.util.*;

public class positive_to_negative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println("x is the greater than 0");
        } else {
            System.out.println("x is the less than or equal 0");
        }
    }
}
