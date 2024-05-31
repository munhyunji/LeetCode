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

// 0, 1, 2, 3, 4, 5

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head; //가짜 더미 앞으로 위치 
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i =0; i < n; i++) {
            fast = fast.next;
        }
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        
        return dummy.next;
    }
}