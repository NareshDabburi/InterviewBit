/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int B) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode current = head;
        ListNode prev = null;
        while(current !=null){
            if(current.val < B){
                al.add(current.val);
                if(prev == null ){
                  if(head.next==null) return null;
                   head = head.next;
                   prev = null;
                   current=head;
                }
                else{
                    ListNode temp=current.next;
                    prev.next = current.next;
                    current.next=null;
                    current = temp;
                }
            }
            else{
                prev = current;
                current=current.next;
            }
            
        }
        ListNode head_new = null;
        ListNode head_new1 = null;
        for(int i=0;i<al.size();i++) {
            ListNode newNode = new ListNode(al.get(i));
            if(head_new==null) {
               head_new=newNode;
               head_new1=head_new;
            }
            else {
                head_new.next=newNode;
                head_new=newNode;
            }
        }
        if(head_new1!=null) {
            head_new.next=head;}
        else {
            head_new1=head;
        }
        
        
        
        
        return head_new1;
    }
}
