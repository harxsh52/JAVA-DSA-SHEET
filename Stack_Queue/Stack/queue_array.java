package Stack_Queue.Stack;
import java.util.*;
public class queue_array {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.add(10);
        q.add(20);
        q.peek();
        q.remove();
        q.peek();
        q.remove();
        q.peek();
        q.remove();
        q.add(56);
        q.peek();
        q.remove();
        q.peek();
    }
}
class Queue{
    int i=0;
    private List<Integer> list = new ArrayList<>();
    boolean isEmpty(){
        return list.size()==i;
    }
    void add(int x){
        list.add(x);
    }
    void peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else {
            System.out.println(list.get(i));
        }
    }
    void remove(){
        if(isEmpty()){
            System.out.println("Queue UnderFlow");
        }else{
            System.out.println("Removing: " + list.get(i));
            list.remove(i);
        }
        }
    }

