package LINKEDLIST.Striver.LEC_1;

import org.w3c.dom.Node;

public class insert {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node insertAtEnd(Node head, int x) {
        // code here
        if(head==null){
            return new Node(x);
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(x);
        return head;
    }
}
