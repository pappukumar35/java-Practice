package Recursion;

import java.util.*;
import java.util.Scanner;

public class operationList {
     public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          list.add(6);
          list.add(7);
          System.out.println(list);

          // get element
          int element = list.get(7);
          System.out.println(list);

          // remove element
          list.remove(2);
          System.out.println(list);

          // set element
          list.set(2, 6);
          System.out.println(list);
          // Contains element
          System.out.println(list.contains(5));
     }
}
