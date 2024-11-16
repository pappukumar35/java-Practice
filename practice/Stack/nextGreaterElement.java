package Stack;

import java.util.*;

public class nextGreaterElement {
     public long[] nextGreaterElement(long[]res, int n){
          Stack<long>stack=new Stack<>();
          long[] res=new long[n];
          for(int i=n-1;i>=0;i--){
               while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                    stack.pop();
               }
               if(stack.isEmpty()){
                    res[i]=-1;
               }
               else{
                    res[i]=stack.peek();
               }
               stack.push(arr[i]);
          }
          return res;
     }

     public static void main(String[] args) {

     }
}
