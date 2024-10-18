package List;

public class FirstBadVersion {
     public static class ListNode {
          int val;
          ListNode left;
          ListNode right;

          ListNode(int val) {
               this.val = val;
               this.left = left;
               this.right = right;
          }
     }

     public int FirstBadVersion(int n) {
          int left = 0;
          int right = n;
          while (left < right) {
               int mid = left + (right - left) / 2;
               if (FirstBadVersion(mid)) {
                    right = mid;
               } else {
                    left = mid + 1;
               }
          }
          return left;
     }

     public static void main(String[] args) {

     }
}