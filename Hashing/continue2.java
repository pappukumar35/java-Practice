package Hashing;

import java.util.*;
import java.util.HashMap;

public class continue2 {
     public static void main(String[] args) {
          HashMap<String, Integer> hm = new HashMap<>();
          hm.put("India", 100);
          hm.put("nepal", 80);
          hm.put("sout", 85);
          hm.put("chainai", 90);
          System.out.println(hm);

          System.out.println(hm.containsKey("india"));
     }
}
