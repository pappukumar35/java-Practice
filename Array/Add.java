package Array;

import java.util.ArrayList;

public class Add {
     public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          System.out.println(list);

          int element = list.get(2);
          System.out.println(element);

          // remove element
          list.remove(2);
          System.out.println(list);

          // set element
          list.set(1, 2);
          System.out.println(list);

          // // size of the Array
          // System.out.println(list.size());
          for (int i = 0; i < list.size(); i++) {
               System.out.print(list.size());

          }
          System.out.println();

     }
}
