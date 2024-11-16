package Recursion;
import java.util.Scanner;
public class reverse {
     static String reverse(Sting s,int idx){
          if(idx==s.length())
          return "";
          String smallAns=reverse(s, idx+1);
          return smallAns+s.charAt(idx);
     }
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String s=sc.nextLine();
          System.out.println(reverse(s, 0));

     }
     
}
