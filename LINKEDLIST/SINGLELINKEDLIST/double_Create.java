package LINKEDLIST.SINGLELINKEDLIST;
import java.util.*;

public class double_Create {
    static class node{
        int data;
        node next;
        node prev;
        node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static node create(node head,int data){
        node node=new node(data);
        if(head==null){
            return node;
        }
        
        node current=head;
        
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        node.prev=current;
        return head;

    }

    public static void print(node head){
        node current=head;
        while(current!=null){
            System.out.print(current.data+"<->");
            current=current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        node head=null;
        for(int i=0;i<n;i++){
            head=create(head, arr[i]);
        }
        print(head);
        System.out.println(head.next.next.prev.data);
    }
}
