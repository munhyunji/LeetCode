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
    public ListNode mergeNodes(ListNode head) {
       
        ListNode dummy = new ListNode(0);
        
        ListNode currentNode = head.next;
        ListNode dummyCurrent = dummy;
        // /[0,3,1,0,4,5,2,0]
         //    c 
        
        //[0,]
        // d
        int cur = 0;
        while(currentNode != null) {
            
            cur += currentNode.val;
            if(currentNode.val == 0) {
                dummyCurrent.next = new ListNode(cur);
                dummyCurrent = dummyCurrent.next;
                cur = 0;
            }

            currentNode = currentNode.next;
        }
        return dummy.next;
    }
}