import java.util.LinkedList;

public class ReverseLinkedList206 {

    public static void main(String[] args) {
//        LinkedList head = new LinkedList();
//        head.
//
//        LinkedList<Integer> head = new LinkedList<Integer>();
//        head.add(1);
//        head.add(2);
//        head.add(3);
//        head.add(4);
//        head.add(5);


//        List//        LinkedList head = new LinkedList();
//        head.
//
//        LinkedList<Integer> head = new LinkedList<Integer>();
//        head.add(1);
//        head.add(2);
//        head.add(3);
//        head.add(4);
//        head.add(5);

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
        ListNode temp;
        while(head!=null){
            temp= head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }

}
