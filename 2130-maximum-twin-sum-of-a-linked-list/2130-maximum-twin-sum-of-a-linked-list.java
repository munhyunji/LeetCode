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
    public int pairSum(ListNode head) {
        // find middle node
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse!
        ListNode prev = null;
        ListNode cur = slow;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        // sum two twin nodeLists
        ListNode left = head;
        ListNode right = prev;
        int max = 0;
        while(right != null) {
            max = Math.max(max, left.val + right.val);
            left = left.next;
            right = right.next;
        }
        return max; 
    }
}