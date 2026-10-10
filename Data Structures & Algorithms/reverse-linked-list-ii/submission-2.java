class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Find the node just before the reversal starts
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        System.out.println(prev.val);

        // First node of the sublist
        ListNode first = prev.next;
        ListNode second = prev.next.next;
        ListNode temp = prev.next.next;

        // Reverse the sublist using pointer manipulation
        for (int i = 0; i < right - left; i++) {
            temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        prev.next.next = temp;
        prev.next = first;

        return dummy.next;
    }
}