package Heap;

import java.util.*;

public class StudentImplement {
     static class Student implements Comparable<Student> {
          String name;
          int rank;

          Student(String name, int rank) {
               this.name = name;
               this.rank = rank;
          }

          @Override
          public int compareTo(Student s2) {
               return this.rank - s2.rank;

          }
     }

     public static void main(String[] args) {
          PriorityQueue<String> pq = new PriorityQueue<>();
          pq.add(new Student("A", 2));
          pq.add(new Student("B", 5));
          pq.add(new Student("A", 2));
          pq.add(new Student("A", 2));
          pq.add(new Student("A", 2));
          while (!pq.isEmpty()) {
               System.out.println(pq.peek().name + "->" + pq.peek().rank());
               pq.remove();
          }

     }
}
