package List;

public class double1 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode head;

        ListNode(int val) {
            this.val = val;
            this.head = head;
            this.next = null;
        }
    }

    public ListNode doubleIt(ListNode head) {
        if (head.val > 4) {
            head = new ListNode(0, head);
        }
        ListNode temp = null;
        while (temp != null) {
            temp.val = (temp.val * 2) % 10;
            if (temp.next != null && temp.next.val > 4) {
                temp.val++;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String args[]) {

    }
}