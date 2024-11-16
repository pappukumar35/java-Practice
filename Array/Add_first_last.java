package Array;

import java.util.ArrayList;

public class Add_first_last {
     public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
          list.add(5);
          System.out.println(list);
          int first = list.get(0);
          int last = list.get(list.size() - 1);
          System.out.println("\nFirst : " + first + ", Last : " + last);

     }

}
