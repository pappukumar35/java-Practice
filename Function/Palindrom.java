package Function;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palindrom = sc.nextInt();
        if (isPalindrom(palindrom)) {
            System.out.println("Numbers:" + palindrom + "is a palindron ");
        } else {
            System.out.println("Nmbers:" + palindrom + "is a not palindrom");
        }
    }

    public static boolean isPalindrom(int num) {
        int palindrom = num;
        int reverse = 0;
        while (palindrom != 0) {
            int remainter = palindrom % 10;
            reverse = reverse * 10 + remainter;
            palindrom = palindrom / 10;

        }
        if (num == reverse) {
            return true;
        } else {
            return false;
        }

    }
}
