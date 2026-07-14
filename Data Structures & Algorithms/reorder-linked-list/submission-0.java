class Solution {

    public ListNode reverseLinkedList(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode newHead = reverseLinkedList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public ListNode midHead(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        return second;
    }

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;

        ListNode second = midHead(head);
        second = reverseLinkedList(second);

        ListNode first = head;

        while(first != null && second != null){
            ListNode next1 = first.next;
            ListNode next2 = second.next;

            first.next = second;
            second.next = next1;

            first = next1;
            second = next2;
        }
    }
}