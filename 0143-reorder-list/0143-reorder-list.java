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
    public void reorderList(ListNode head) {
        // Find the Middle 
        if(head == null) return;
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode next = null;
        // Now slow is at the middle 
        ListNode prev = null, curr = slow.next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        } 
        
        slow.next = null;
        
        // merge two lists
        ListNode head1 = head, head2 = prev;
        while(head2 != null) {
            next = head1.next;
            head1.next = head2;
            head1 = head2;
            head2 = next;
        }
    }
}