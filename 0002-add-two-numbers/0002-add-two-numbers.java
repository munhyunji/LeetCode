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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode currentNode = dummy;
        int carry = 0;
        
        while(l1 != null || l2 != null || carry > 0) { //길이가달라도 끝까지 수행 
            int v1 = (l1 != null) ? l1.val : 0;
            int v2 = (l2 != null) ? l2.val : 0;
            
            int sum = v1 + v2 + carry;
            carry = sum /10;
            int val = sum % 10; 
            currentNode.next = new ListNode(val);
            
            //move pointer
            currentNode = currentNode.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

        }
        return dummy.next; 
    }
}