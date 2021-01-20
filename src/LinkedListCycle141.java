

public class LinkedListCycle141 {
    public static void main(String[] args) {
        ListNode head4 = new ListNode(-4);
        ListNode head3 = new ListNode(0);
        ListNode head2 = new ListNode(2);
        ListNode head = new ListNode(3);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;
//        while(head!=null){
//            System.out.println(head.val);
//            head=head.next;
//        }
        System.out.println(hasCycle(head));
    }

    public static boolean hasCycle(ListNode head) {

        ListNode fast =head;
        ListNode slow = head;
        while(fast!= null&&fast.next!=null  ){
            slow = slow.next;
            fast = fast.next.next;
            if (fast  == slow){
                return true;
            }
        }
        return false;
    }
}
