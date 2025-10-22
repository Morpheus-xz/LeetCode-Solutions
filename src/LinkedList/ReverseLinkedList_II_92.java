/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // Base case: if the list is empty or no reversal is needed
        if (head == null || left == right) {
            return head;
        }

        // Step 1: Create a dummy node before the head
        // This simplifies handling when the reversal starts from the first node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 2: Move 'prev' to the node just before the 'left' position
        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        // At this point:
        // 'prev' → node before the reversal starts
        // 'cur' → first node of the part that needs to be reversed
        ListNode cur = prev.next;

        // Step 3: Reverse the sublist between 'left' and 'right'
        // We repeatedly take the next node (temp) and move it right after 'prev'
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next; // 'temp' is the node to be moved to the front
            cur.next = temp.next; // Detach 'temp' from its current position
            temp.next = prev.next; // Point 'temp' to the new start of the reversed section
            prev.next = temp; // Move 'temp' to the front of the reversed section
        }

        // Step 4: Return the new head (dummy.next handles cases where head changed)
        return dummy.next;
    }
}
