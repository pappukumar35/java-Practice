package oop;

import java.io.*;
import java.util.*;

public class inheritance {
     public static void main(String[] args) {
          Animals.Fish shark = new Animals().new Fish();
          shark.eat();
     }

     static class Animals {
          String color;

          void eat() {
               System.out.println("Animal eats");
          }

          void breath() {
               System.out.println("Animal breathes");
          }

          class Fish extends Animals {
               int fins;

               void swim() {
                    System.out.println("Fish swims in the water");
               }
          }
     }
}
