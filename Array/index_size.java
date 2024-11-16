package Array;

import java.io.*;
import java.util.*;

public class index_size {
     public static void main(String[] args) {
          ArrayList<Integer> arr = new ArrayList<>();
          arr.add(10);
          arr.add(30);

          arr.add(40);

          arr.add(50);
          System.out.println(arr);
          int element = arr.get(2);
          System.out.println("The element Index 2:" + element);

     }
}
