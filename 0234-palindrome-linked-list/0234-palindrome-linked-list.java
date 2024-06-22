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
        
        if (head == null || head.next == null) return true;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode currentNode = head;
        
        int length = 1;
        while(currentNode != null) {
            currentNode = currentNode.next;
            length++;
        }

        while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
        
        ListNode prev = null;
        ListNode tmp = null;
        for(int i = 0; i < length/2; i++) {
            tmp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = tmp;
        }
        ListNode left = head;
        ListNode right = prev;
        
        while(right != null) {
            if(left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
            
        }
  
        return true; 
    }
}