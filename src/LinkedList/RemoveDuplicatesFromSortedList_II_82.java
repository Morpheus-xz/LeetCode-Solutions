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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(); // used to make new connections by connecting further nodes
        dummy.next=head;
        // we will use curr to traverse into linked list without actually affecting head of linked list
        ListNode curr = head;

        //points to last node before any reperating sequence appears
        ListNode prev = dummy;

        while(curr!=null){
            // to check if curr node have duplicates ahead
            if(curr.next!=null && curr.val==curr.next.val){
                // skip all
                while(curr.next!=null && curr.val==curr.next.val){
                    curr=curr.next;
                }
                // connect prev to curr.next after skipping all dplcts
                prev.next=curr.next;
                // move curr ahead
                curr=prev.next;
            }
            else{
                // no duplicates go ahead
                curr=curr.next;
                prev=prev.next;
            }
        }
        return dummy.next;
    }
}