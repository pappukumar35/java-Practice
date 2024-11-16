package Hashing;

import java.util.HashMap;
import java.util.*;

public class geto {
     public static void main(String[] args) {
          HashMap<String, Integer> hm = new HashMap<>();
          hm.put("India", 100);
          hm.put("nepal", 80);
          hm.put("sout", 85);
          hm.put("chainai", 90);
          System.out.println(hm);

          int population = hm.get("india");
          System.out.println(population);
     }
}
