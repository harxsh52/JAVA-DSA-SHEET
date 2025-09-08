import java.util.Stack;

public class sortstack {
    public static void sortedInsert(Stack<Integer> s, int x) {
        // If stack is empty or element is greater than top element, push it
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        // Pop elements until correct position is found
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    // Function to sort the stack
    public Stack<Integer> sort(Stack<Integer> s) {
        // If stack is not empty, pop element, sort remaining stack, and insert element
        // in sorted manner
        if (!s.isEmpty()) {
            int x = s.pop();
            sort(s);
            sortedInsert(s, x);
        }
        return s;
    }
}
