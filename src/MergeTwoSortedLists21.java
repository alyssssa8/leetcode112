public class MergeTwoSortedLists21 {
    public static void main(String[] args) {

        ListNode head6 = new ListNode(6);
        ListNode head5 = new ListNode(5);
        ListNode head4 = new ListNode(4);
        ListNode head3 = new ListNode(3);
        ListNode head2 = new ListNode(2);
        ListNode head = new ListNode(1);
        head.next = head2;
        head2.next = head3;

        head4.next = head5;
        head5.next = head6;
        while (head4 != null) {
            System.out.println(head4.val);
            head4 = head4.next;
        }
        mergeTwoLists(head, head4);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        while(l1!=null && l2!=null){
            if (l1.val < l2.val){
                result.next = l1;
                l1 = l1.next;
            }
            else{
                result.next = l2;
                l2 = l2.next;
            }
            result=result.next;
        }
        if (l1!=null){
            result.next = l1;
        }
        if (l2!=null){
            result.next = l2;
        }
        return dummy.next;
    }


}
