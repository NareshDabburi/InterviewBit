/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        ListNode current=A;
            int count=0;
            if(A==null) {
                return null;
            }
            while(current!=null) {
                count++;
                current=current.next;
            }
            
            if(B>count){
                 B=B%count;
            }
            int k=count-B;
            current=A;
            int c=1;
            while(c<k) {
                c++;
                current=current.next;
            }
            ListNode lastNode=current;
            while(current.next!=null) {
                current=current.next;
            }
            current.next=A;
            A = lastNode.next;
            lastNode.next=null;
            //System.out.println(count);
            return A;
    }
}
