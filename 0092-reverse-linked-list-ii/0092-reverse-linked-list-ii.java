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

        //1) left point까지 움직인다 이전 포인터와 함께
        for(int i = 0; i < left-1; i++) {
         leftPrevNode = leftNode; 
         leftNode = leftNode.next;   
        }
        
        //2) reverse한다         
        ListNode tmp = null;
        ListNode prev = null;
        for(int i = 0; i < right-left+1; i++) { //gap+1
            tmp = leftNode.next; //tmp가 다음 node를 가르키게 함 
            leftNode.next = prev;
            prev = leftNode; 
            leftNode = tmp;                        
        }
        
        //3) 끊어진 노드들을 연결  .. 
        leftPrevNode.next.next = leftNode;
        leftPrevNode.next = prev;
        
        return dummy.next; 
    }
}