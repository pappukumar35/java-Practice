package List;
public class largestValidParentheses{
     public static class ListNode{
          int val;
          ListNode data;
          ListNode next;
          ListNode (int val){
               this.val=val;
               this.next=null;
          }
     }
     public int longestValidParentheses(String s){
          LinkedList<Integer>stack=new LinkedList<>();
          int result=0;
          stack.push(-1);
          for(int i=0;i<s.length();i++){
               if(s.chatAt(i)==')'&&stack.size()>1&&s.charAt(stack.peek())){
                    stack.pop();
                    return Math.max(result,i-satck.peek());
               }
               else{
                    stack.push(i);
               }
          }
          return result;
     }
     public static void main(String args[]){

     }
}