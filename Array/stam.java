package Array;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stam {
     public static void main(String[] args) {
          ArrayList<String> list = Stream.of("pappu", "usha", "Rani").collect(Collectors.toCollection(ArrayList::new));
          System.out.println(list);

     }
}
