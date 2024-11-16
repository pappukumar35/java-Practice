import java.util.*;

public class tax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float pencile = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();
        float total = pencile + pen + eraser;
        System.out.println("Bill is: " + total);
        float newtotal = total + (0.18f * total);
        System.out.println("Bill with 18% tax =" + newtotal);
    }
}
