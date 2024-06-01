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
    public int getDecimalValue(ListNode head) {
        ListNode currentNode = head;
        int num = 0;
        
        while (currentNode != null) {
            num = (num * 2) + currentNode.val; // 2^n 
            currentNode = currentNode.next;                  
        }        
        return num;
    }
}