package Graph3;

import java.util.*;

public class Adjacency {
     public static class Edge {
          int src;
          int dest;
          int wt;

          public Edge(int s, int d, int w) {
               this.src = s;
               this.dest = d;
               this.wt = w;
          }
     }

     public static void main(String[] args) {
          int v = 5;
          ArrayList<Edge> graph[] = new ArrayList[v];
          for (int i = 0; i < v; i++) {
               graph[i] = new ArrayList<>();
          }

          // edge
          graph[0].add(new Edge(0, 1, 5));
          graph[1].add(new Edge(1, 0, 5));
          graph[1].add(new Edge(1, 2, 1));
          graph[1].add(new Edge(1, 3, 3));

          graph[2].add(new Edge(2, 1, 1));
          graph[2].add(new Edge(2, 3, 1));
          graph[2].add(new Edge(2, 4, 4));

          graph[3].add(new Edge(3, 1, 3));
          graph[3].add(new Edge(3, 2, 1));

          graph[4].add(new Edge(4, 2, 2));

          // Print each vertex's edges
          for (int i = 0; i < v; i++) {
               System.out.println("Vertex " + i + ":");
               for (int j = 0; j < graph[i].size(); j++) {
                    Edge e = graph[i].get(j);
                    System.out.println(e.dest);
               }
          }
     }
}
