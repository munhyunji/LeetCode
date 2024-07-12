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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode cur = head;
        ListNode tail = head;
        int len = 1;
        while(cur != null && cur.next != null) {
            len++;
            cur = cur.next;   
            tail = tail.next;
        }
        
        k = k % len; //node길이보다 k가 길때 길이보정 
        if(k == 0) return head;
        
        cur = head;
        
        ListNode pivot = head;
        ListNode tmp = null;  
        
        for(int i = 0; i < len-k-1; i++) {
            pivot = pivot.next;
        }
        tmp = pivot.next;
        pivot.next = null;
        tail.next = cur;
        
        return tmp;                
    }
}