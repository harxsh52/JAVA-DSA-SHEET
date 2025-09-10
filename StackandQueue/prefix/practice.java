package StackandQueue.prefix;
import java.util.Stack;

class practice{
    public static void infixToPostfix(String s) {
        // code here
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for(char ch:s.toCharArray()){
            if(Character.isLetter(ch) || ch=='(' || ch==')'){
                s1.push(ch);
            }else{
                s2.push(ch);
            }
        }
        while(!s1.isEmpty()){
            System.out.print(s1.pop());
        }
        System.out.println();
        while(!s2.isEmpty()){
            System.out.print(s2.pop()); }    
        return ;
    }
    public static void main(String[] args) {
        infixToPostfix("a+b*(c^d-e)^(f+g*h)-i");
    }
}