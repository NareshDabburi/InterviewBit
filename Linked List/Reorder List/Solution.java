/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode head) {
        ListNode current = head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        if(head==null || head.next==null) {
            return head;
        }
        while(fast!=null && fast.next!=null) {
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
        }
        prev.next=null;
        ListNode newHead=null;
        newHead=slow;
        ListNode head1 = reverse(newHead);
        current = head;
        ListNode next=null;
        ListNode next_head=null;
        while(current!=null && head1!=null) {
            next=current.next;
            next_head=head1.next;
            current.next=head1;
            head1.next=next;
            head1=next_head;
            current=next;

        }
        if(next_head!=null) {
        current = head;
        prev=null;
        while(current!=null) {
            prev=current;
            current=current.next;
        }
        prev.next=next_head;
        next_head.next=null;
        }
        
        
         
        return head;
    }
    
    private static ListNode reverse(ListNode head1) {
        ListNode current = head1;
        ListNode next = null;
        ListNode prev = null;
        while(current.next !=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current.next = prev;
        head1 = current;
        return head1;
    }
        
    
}
