package Array;

public class ArrayExample {
     void demoExampli() {
          int[] num = new int[10];
          float[] weight = new float[3];
          String[] name = new String[3];
          num[0] = 1;
          num[1] = 2;
          num[2] = 5;
          System.out.println(num[0]);
          System.out.println(num[1]);
          System.out.println(num[2]);

     }

     public static void main(String args[]) {

          ArrayExample obj = new ArrayExample();
          obj.demoExampli();

     }

}