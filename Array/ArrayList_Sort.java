package Array;

import java.io.*;
import java.util.*;

public class ArrayList_Sort {
     public static void main(String args[]) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(8);
          list.add(3);
          list.add(5);
          System.out.println("Before sorting list:" + list);
          System.out.println(list);
          Collections.sort(list);
          System.out.println("After sorting list:" + list);
          System.out.println(list);

     }
}
