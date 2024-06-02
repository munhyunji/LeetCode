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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode currentNode = head;
        ListNode prevNode = dummy;
        
        int n = 0;
        
        while(head != null) {
            n++;
            head = head.next;
        }
               
        for(int i = 0; i < n/2; i++) {
            prevNode = currentNode;       
            currentNode = currentNode.next;       
        }
        
        prevNode.next = currentNode.next;
        
        return dummy.next;
        
        
    }
}