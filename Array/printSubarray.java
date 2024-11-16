package Array;

import java.util.*;

public class printSubarray {

    public static void printSubarray(int numbers[]) {
        int ts = 0;
        Object numbres;
        for (int i = 0; i < numbres.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= numbers.length; k++) {
                    System.out.print(numbers[k] + "");
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("total subarray=" + ts);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarray(numbers);
    }
}
