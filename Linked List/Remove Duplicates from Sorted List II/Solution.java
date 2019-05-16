package interviewbit;

import java.util.ArrayList;
import java.util.Scanner;

public class linkedlist_remove_duplicates_from_sorted_likedlist2 {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current =head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    static SinglyLinkedListNode removeduplicates(SinglyLinkedListNode head) {
    	SinglyLinkedListNode current=head;
    	ArrayList al = new ArrayList();
        while(current.next!=null) {
        	if(current.data==current.next.data) {
        		if(!al.contains(current.data)) {
        			al.add(current.data);
        		}
        	}
        	current=current.next;
        }
        
        
        
        SinglyLinkedListNode prev=head;
        current=head.next;
        
       // current=head;
        while(current!=null) {
        	
        	if(al.contains(current.data)) {
        		prev.next=current.next;
        	}
        	else {
        		prev=current;
        	}
        	//prev=current;
        	current=current.next;
        }
        if(al.contains(head.data)) {
        	if(head.next==null) {
        		return null;
        	}else {
        		head=head.next;
        	}
        }
        
        
        
        System.out.println(al);
        return head;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        SinglyLinkedListNode head =removeduplicates(llist.head);

        printLinkedList(head);

        scanner.close();
    }
}

