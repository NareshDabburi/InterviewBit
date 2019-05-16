/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n<=0)
        {
            return head;
        }
        int size=0;
        ListNode test=head;
        while(test!=null){
            size++;
            test=test.next;
        }
        if(n>size){
           return head.next;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        for(int i=0;i<n;i++){
            if(fast==null){
                return null;
            }
            fast=fast.next;
        }
        while(fast!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=slow.next;
        
        return head;
    }
}
