package List;

import java.util.*;

public class nextGreaterElement {
     public static class ListNode {
          int val;
          ListNode next;

          ListNode(int val) {
               this.val = val;
               this.next = null;
          }
     }

     public int[] nextLargestNodes(ListNode head) {
          List<Integer> list = new ArrayList<>();

          // Convert linked list to array list
          for (ListNode temp = head; temp != null; temp = temp.next) {
               list.add(temp.val);
          }

          int[] res = new int[list.size()];
          Stack<Integer> stack = new Stack<>();

          // Find the next greater element for each node
          for (int i = 0; i < list.size(); i++) {
               while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                    res[stack.pop()] = list.get(i);
               }
               stack.push(i);
          }

          // Elements left in the stack have no greater element
          while (!stack.isEmpty()) {
               res[stack.pop()] = 0;
          }

          return res;
     }

     public static void main(String[] args) {
          // Example usage:
          ListNode head = new ListNode(2);
          head.next = new ListNode(1);
          head.next.next = new ListNode(5);

          nextGreaterElement solution = new nextGreaterElement();
          int[] result = solution.nextLargestNodes(head);

          System.out.println(Arrays.toString(result)); // Output: [5, 5, 0]
     }
}
