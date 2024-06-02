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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode currentNode = head;
        ListNode prevNode = dummy;

        // 0-1-2-6-3-4-5-6
        
        while(currentNode != null) {
            if(currentNode.val == val) {
                prevNode.next = currentNode.next;
            }  else {
                prevNode = currentNode;
            }
            currentNode = currentNode.next;

        }
        return dummy.next;
    }
}