public class Solution {
    public int lPalin(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        slow=rev(slow);
        fast=head;
        while(slow!=null) {
            if(slow.val != fast.val) {
                return 0;
                
            }
            slow=slow.next;
            fast=fast.next;
        }
        
        return 1;
    }
    private static ListNode rev(ListNode head) {
        ListNode prev=null;
        ListNode next=null;
        ListNode current=head;
        while(current!=null) {
            next=current.next;
            current.next=prev;
            prev=current;
            current= next;
            
        }
        return prev;
    }
}
