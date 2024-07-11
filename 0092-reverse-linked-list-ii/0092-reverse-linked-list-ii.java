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
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode leftPrevNode = dummy;
        ListNode leftNode = head;
        
        //1) move leftNode
        for(int i = 0; i < left-1; i++) {
            leftPrevNode = leftNode;
            leftNode = leftNode.next;
        }
        
        //2) turn arrows
        ListNode prev = null;
        ListNode tmp = null;
        for(int i = 0; i < right-left+1; i++) {
            tmp = leftNode.next;
            leftNode.next = prev;
            prev = leftNode;
            leftNode = tmp;
        }
        
        //3) 끝과 끝을 연결 
        leftPrevNode.next.next = leftNode;
        leftPrevNode.next = prev;
        
        return dummy.next;
    }
}