package Recursion.Easy;
import java.util.Stack;
class stack {
    static void reverse(Stack<Integer> St) {
        // code here
        if(!St.isEmpty()){
            int x=St.pop();
            reverse(St);
            insertAtbottom(St,x);
        }
    }
    static void insertAtbottom(Stack<Integer> St,int x){
        if(St.isEmpty()){
            St.push(x);
        }else{
            int a=St.pop();
            insertAtbottom(St,x);
            St.push(a);
        }
    }
}

