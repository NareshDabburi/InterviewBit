/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(m==n) {
                return head;
            }
            ListNode current=head;
            int count=1;
            ListNode prev_m=null;
            while(current!=null&&count<m) {
                count++;
                if(m!=1) {
                    prev_m=current;
                }
                
                current=current.next;
            }
            ListNode current_m=current;
            ListNode next_n=null;
            while(current!=null&&count<n) {
                count++;
                current=current.next;
                if(current.next==null) {
                    next_n=null;
                }
                next_n=current.next;
            }
            ListNode current_n=current;
            /*SinglyLinkedListNode newhead=null;
            if(current.next!=null) {
                 newhead=current.next;
            }else {
                newhead=null;
            }*/
            current_n.next=null;
            //SinglyLinkedListNode reversed_list=rev(current_m);
            // reverse
            ListNode head_r=current_m;
            ListNode reversed_list=null;
            if(head_r==null) {
                reversed_list=head_r;
            }
            ListNode current_r=head_r;
            ListNode next_r=head_r;
            ListNode prev_r=null;
            while(current_r.next!=null) {
                next_r=current_r.next;
                current_r.next=prev_r;
                prev_r=current_r;
                current_r=next_r;
                
            }
            current_r.next=prev_r;
            head_r=current_r;
            reversed_list=head_r;
            
            
            
            
            
            
            if(prev_m==null) {
                head=reversed_list;
            }else {
                prev_m.next=reversed_list;
            }
            while(reversed_list.next!=null) {
                reversed_list=reversed_list.next;
            }
            reversed_list.next=next_n;
            
            
            return head;
        }
        
}
