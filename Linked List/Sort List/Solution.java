/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ListNode current = head;
        while(current!=null){
            al.add(current.val);
            current=current.next;
        }
        
        int a[] = new int [al.size()];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        Arrays.sort(a);
        ListNode head_new= null;
        
        for(int i=0;i<a.length;i++){
            if(head_new==null){
                ListNode newNode = new ListNode(a[i]);
                head_new = newNode;
                head=head_new;
            }else{
                ListNode newNode = new ListNode(a[i]);
                head_new.next=newNode;
                head_new=newNode;
            }
        }
        return head;
    }
}
