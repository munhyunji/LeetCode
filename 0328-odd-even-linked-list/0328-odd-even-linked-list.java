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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        
        ListNode cur = head;
        ListNode oddPointer = odd;
        ListNode evenPointer = even;
        int count = 1;
        
        while(cur != null) {
            if(count % 2 == 0) {
                evenPointer.next = new ListNode(cur.val);
                evenPointer = evenPointer.next; 
            } else {
                oddPointer.next = new ListNode(cur.val);
                oddPointer = oddPointer.next; 
            }
            count++;
            cur = cur.next;
        }
        oddPointer.next =  even.next;
        return odd.next;
    }
}