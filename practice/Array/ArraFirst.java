package Array;

import javax.xml.transform.SourceLocator;

public class ArraFirst {
     void freeExample() {
          int[] arr = new int[10];
          arr[0] = 10;
          arr[1] = 12;
          arr[2] = 15;
          System.out.println(arr[0]);
          System.out.println(arr[1]);
          System.out.println(arr[2]);
     }

     public static void main(String[] args) {
          ArraFirst obj = new ArraFirst();
          obj.freeExample();
     }
}
