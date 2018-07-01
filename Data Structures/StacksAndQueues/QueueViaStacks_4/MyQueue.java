import java.util.Stack;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class MyQueue {
    private Stack stack1;
    private Stack stack2;

    MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    void push(Object value) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    Object pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    Object peek() {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return stack1.peek();
    }

    boolean isEmpty() {
        return (stack1.empty() && stack2.empty()) ? TRUE : FALSE;
    }
}
