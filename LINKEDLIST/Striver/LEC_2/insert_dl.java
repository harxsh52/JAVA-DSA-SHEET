package LINKEDLIST.Striver.LEC_2;

import org.w3c.dom.Node;

public class insert_dl {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node addNode(Node head, int p, int x) {
        // code here
        Node node=new Node(x);
        if(head==null){
            return node;
        }
        if(p==-1){
            node.next=head;
            head.prev=node;
            head=node;
            return head;
        }
        Node temp=head;
        while(temp!=null && p>0){
            temp=temp.next;
            p--;
        }
        node.next=temp.next;
        temp.next=node;
        node.prev=temp;
        return head;
      
}}
