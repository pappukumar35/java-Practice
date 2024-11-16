package Array;

public class condation {
     void Array() {
          int[] ages = new int[10];
          float[] weight = new float[1];
          String[] name = { "laddu,pappu,usha, madhu, mohan,sohan" };
          for (int i = 1; i < 10; i++) {
               System.out.println(ages[i]);
          }
     }

     public static void main(String[] args) {
          condation obj = new condation();
          obj.Array();
     }
}
