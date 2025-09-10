import java.util.Stack;

class validparenthisi {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty()){
                    return false;
                }else{
                    if((stack.peek()=='(' && ch==')' )||(stack.peek()=='{' &&  ch=='}')||(stack.peek()=='[' && ch==']')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}