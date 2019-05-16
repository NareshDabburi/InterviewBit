/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        Boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast !=null && fast == slow){
                flag= true;
                break;
            }
    }
        if(flag == true){
             slow = head;
            while(slow != fast){
                slow=slow.next;
                fast=fast.next;
                
            }
            return fast;
        }else{
        return null;
        }
        
        
        
    }
}
