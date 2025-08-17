package LINKEDLIST.Striver.LEC_2;

public class delete_dl {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public Node deleteNode(Node head, int x) {
    // Case 1: empty list
    if (head == null) return null;

    // Case 2: delete head
    if (x == 1) {
        if (head.next != null) {
            head = head.next;
            head.prev = null;
        } else {
            return null; // only one node
        }
        return head;
    }

    // Traverse to x-th node
    Node temp = head;
    int count = 1;
    while (temp != null && count < x) {
        temp = temp.next;
        count++;
    }

    // Position out of bounds
    if (temp == null) return head;

    // Adjust links
    if (temp.prev != null) temp.prev.next = temp.next;
    if (temp.next != null) temp.next.prev = temp.prev;

    return head;
}
}
