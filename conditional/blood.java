package conditional;

import java.util.*;

public class blood {
     public static void main(String[] args) {
          int age = 18;
          int weight = 50;
          if (age > 18) {
               if (weight >= 50) {
                    System.out.println("you are eligablity for donate blood ");
               } else if (age < 18) {
                    if (weight < 50) {
                         System.out.println("you are not eligablity for donate blood");
                    }
               }
          }
     }
}
