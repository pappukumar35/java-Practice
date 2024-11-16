package operator;

public class test2 {

    public static void main(String args[], String string) {
        int x = 30;
        int y = 5;
        int z = 20;
        if (x > y && y > z) {
            System.out.println("Hello");
        }
        if (z > y && z < y) {
            System.out.println(string);
        }
        if ((y + 30) < x && (y + 15) < z) {
            System.out.println("Hello java");
        }
    }

}
