package Hashing;

import java.util.*;

public class key {
     public static void main(String[] args) {
          HashMap<String, Integer> hm = new HashMap<>();
          hm.put("India", 100);
          hm.put("nepal", 110);
          hm.put("chaina", 800);
          System.out.println(hm);
          Set<String> keys = hm.keySet();
          System.out.println(keys);

          for (String k : keys) {
               System.out.println("key=" + k + ",value=" + hm.get(k));
          }
     }
}