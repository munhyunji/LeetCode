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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode left = head;
        ListNode right = head;
        
        for(int i = 1; i < k; i++) {
            left = left.next;
        }
        
        // 1-2-3-4-5
        //   s
        
        ListNode currentNode = left;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
            right = right.next;
        }
        
        int t = left.val;
        left.val = right.val;
        right.val = t;
        
        return head;
    }
}