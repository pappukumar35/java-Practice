package Array;

import java.util.*;

public class Arrayremove {

     public static void main(String[] args) {
          ArrayList<String> list = new ArrayList<>();
          list.add("pappu");
          list.add("kumar");
          list.add("techno");
          System.out.println("original ArrayList:" + list);
          list.remove(2);
          System.out.println("modified Arraylist:" + list);

          // linkedList using
          LinkedList<String> List = new LinkedList<>();
          list.add("usha");
          list.add("kumari");
          list.add("rani");
          System.out.println("original ArrayList:" + list);
          System.out.println("modified ArrayList:" + list);
          ;
     }
}
