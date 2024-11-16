package conditional;

import java.util.*;

public class table {
    public static void printmultiplicationTable(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + "=" + n * i);
        }

    }

    public static void main(String args[]) {
        printmultiplicationTable(9);

    }
}
