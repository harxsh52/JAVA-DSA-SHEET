package LINKEDLIST.Striver.LEC_1;

public class length {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public int getCount(Node head) {
        // code here
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
}
