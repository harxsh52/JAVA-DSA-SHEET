package LINKEDLIST.SINGLELINKEDLIST;
import java.util.*;

//class for double linkedlist
public class double_Create {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        Node(int data, Node next, Node prev){
            this.data=data;
            this.next=next;
            this.prev=prev;
        }

        // Doublelinkedlist creation
    public static Node create(Node head,int data){
        Node Node=new Node(data);
        if(head==null){
            return Node;
        }
        
        Node current=head;
        
        while(current.next!=null){
            current=current.next;
        }
        current.next=Node;
        Node.prev=current;
        return head;

    }

    //insert at head 
    public static Node inserthead(Node head,int data){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }

public static Node insertAtPosition(Node head, int data, int position) {
    Node newNode = new Node(data);

    // Case 1: Insert at head (position = 0)
    if (head == null || position == 0) {
        newNode.next = head;
        if (head != null) head.prev = newNode;
        return newNode;
    }

    Node current = head;
    // Traverse until the Node before the insertion position
    while (current.next != null && position > 1) {
        current = current.next;
        position--;
    }

    // Case 2: Position out of bounds
    if (position > 1) {
        System.out.println("Position out of bounds");
        return head;
    }

    // Insert the new Node
    newNode.next = current.next;
    newNode.prev = current;
    current.next = newNode;

    if (newNode.next != null) {
        newNode.next.prev = newNode;
    }
    return head;
}

    //print the double linkedlist
    public static void print(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("null");
    }

    public static Node deleteAtposition(Node head,int position){
        if(head==null || position < 0) {
            return head; // Invalid position or empty list
        }
        if(position==0){
            head=head.next;
            if(head!=null) head.prev=null;
            return head;
        }
        Node current=head;
        while(current!=null && position>0){
            current=current.next;
            position--;
        }
        if(current==null){
            System.out.println("Position out of bounds");
            return head; // Position is out of bounds
        }
        if(current.prev!=null) {
            current.prev.next=current.next;
        }
        if(current.next!=null) {
            current.next.prev=current.prev;
        }
        return head;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Node head=null;
        for(int i=0;i<n;i++){
            head=create(head, arr[i]);
        }
        print(head);
    }
}
