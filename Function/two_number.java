package Function;

import java.util.*;

public class two_number {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number");
        double x = sc.nextDouble();

        System.out.println("Enter your  Second number");
        double y = sc.nextDouble();
        System.out.println("Enter your third number");
        double z = sc.nextDouble();
        System.out.print("The average value is " + average(x, y, z) + "\n");

    }

    public static double average(double x, double y, double z) {
        return (x + y + z);

    }

}
