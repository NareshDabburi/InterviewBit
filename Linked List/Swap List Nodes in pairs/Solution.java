/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode temp = head; 
  
        /* Traverse only till there are atleast 2 nodes left */
        while (temp != null && temp.next != null) { 
  
            /* Swap the data */
            int k = temp.val; 
            temp.val = temp.next.val; 
            temp.next.val = k; 
            temp = temp.next.next; 
         } 
         
         return head;
    }
}
