public class RemoveLinkedListElements203 {

    public static void main(String[] args) {
        ListNode head7 = new ListNode(6);
        ListNode head6 = new ListNode(5);
        ListNode head5 = new ListNode(4);
        ListNode head4 = new ListNode(3);
        ListNode head3 = new ListNode(6);
        ListNode head2 = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;
        head5.next = head6;
        head6.next = head7;
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
        removeElements(head,6);
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode trav = new ListNode(0);
        ListNode result = trav;
        trav.next = head;
        while(trav.next!=null){
            if (trav.next.val == val){
                trav.next  = trav.next.next;
            }
            else {
                trav = trav.next;
            }
        }
        return result.next;
    }

}
