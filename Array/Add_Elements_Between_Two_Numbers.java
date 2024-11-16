package Array;

import java.util.ArrayList;

public class Add_Elements_Between_Two_Numbers {
     public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);
          list.add(50);
          list.add(60);
          list.add(70);
          System.out.println(list);
          list.add(2, 25);
          System.out.println(list);

     }

}