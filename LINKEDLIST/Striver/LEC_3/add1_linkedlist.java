package LINKEDLIST.Striver.LEC_3;
//hello
public class add1_linkedlist {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node reverse(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public Node addOne(Node head) {
        // code here.
        head=reverse(head);
        int sum=0;
        Node current=head;
        int k=current.data+1+sum;
        current.data=k%10;
        Node prev=current;
        sum=k/10;
        current=current.next;
        while(current!=null){
            prev=current;
            k=current.data+sum;
            current.data=k%10;
            sum=k/10;
            current=current.next;
        }
        if(sum==1){
            prev.next=new Node(1);
        }
        head=reverse(head);
        return head;
    }
}
