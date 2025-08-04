package LINKEDLIST.SINGLELINKEDLIST;
public class linkedlist_Create{

// Class for linkedlist
static class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }

    // linkedlist creation
    public static Node create(Node head,int data){
        if(head==null){
            return new Node(data);
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(data);
            return head;
        }
    }  

    // printing the linkedlist

    public static void print(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }  

    //insert at head

    public static Node inserthead(Node head,int data){
        if(head==null){
            return new Node(data);
        }
        else{
            Node newNode=new Node(data,head);
            return newNode;
        }
    }

    // delete at head

    public static Node delete(Node head,int data){
        if(head==null){
            return null;
        }Node prev=null;

        Node current=head;
        while(current!=null && current.data!=data){
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;
    }
    
    //main function

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        Node head=null;
        for(int i:arr){
            head=create(head,i);
        }
        print(head);
        head=inserthead(head,0);
        print(head);
        head=create(head,6);
        print(head);
        delete(head,4);
        print(head);
    }
}}