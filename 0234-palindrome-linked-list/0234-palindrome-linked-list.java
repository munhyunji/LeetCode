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

// 1, 2, 3, 4, 4, 3, 2, 1

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        if(head == null || head.next == null) return true; //노드 1개인경우 
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode currentNode = head;
        int length = 1;
        
        //노드길이 구하깅
        while(currentNode != null) {
            currentNode = currentNode.next;
            length++;
        }
        
        //fast와 slow를 움직일때는 while문을 사용할것..  fast를 끝까지 옮긴다. 
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode prevNode = null;
        ListNode nextNode = null;
        for(int i = 0; i < length/2; i++) {
            nextNode = slow.next;
            slow.next = prevNode;
            prevNode = slow;
            slow = nextNode;
        }
        
        ListNode left = head;
        ListNode right = prevNode;
        while(left != null && right != null) {
            if(left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}