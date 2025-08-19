package Stack_Queue.Stack;

public class stack_array {
    
    public static void main(String[] args){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s.pop());
        s.peek();
        System.out.println(s.pop());
        s.peek();
        s.size();
        System.out.println(s.pop());
        s.size();
    }
}
class Stack{
        int size=10000;
        int top=-1;
        int arr[]=new int[size];
        boolean isEmpty(){
            return top==-1;
        }
        void push(int x){
            top++;
            arr[top]=x;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack UndderFloe");
                return -1;
            }else{
                int x=arr[top];
                top--;
                return x;
            }
        }
         void peek(){
            if(isEmpty()){
                System.out.println("Stack UnderFlow");
            }else{
                System.out.println(arr[top]);
            }
        }
        void size(){
            if(isEmpty()){
                System.out.println("Stack is empty");
            }else{
                System.out.println("Size of stack is: " + (top + 1));
        }
    }
}
