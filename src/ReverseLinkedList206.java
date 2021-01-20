public class ReverseLinkedList206 {

    public static void main(String[] args) {
        ListNode head5 = new ListNode(5);
        ListNode head4 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        ListNode head2 = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head5;

        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        reverseList(head);
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

}
