package Hashing;

import java.util.HashMap;
import java.util.Set;

public class major_length {
     public static void main(String[] args) {
          int arr[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
          HashMap<Integer, Integer> map = new HashMap<>();

          for (int i = 0; i < arr.length; i++) {
               if (map.containsKey(arr[i])) {
                    map.put(arr[i], map.get(arr[i]) + 1); // Correct frequency update
               } else {
                    map.put(arr[i], 1); // Initialize the frequency to 1
               }
          }

          Set<Integer> keySet = map.keySet();
          for (Integer key : keySet) {
               if (map.get(key) > arr.length / 3) { // Only print keys with high frequency
                    System.out.println(key);
               }
          }
     }
}
