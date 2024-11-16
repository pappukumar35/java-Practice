package Function;

import java.util.*;

public class odd_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter your interger number");
        num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("Number is Even ");
        } else {
            System.out.println("Number is odd");
        }

    }

    private static boolean isEven(int num) {

        // TODO Auto-generated method stub
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
