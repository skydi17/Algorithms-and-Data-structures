//import java.util.Stack;

public class SortStack {
//TODO try to implement solution without buffer
    static void insertItem(Stack stack, Stack buffer, Stack result) {
        try {
            while (!result.isEmpty() && (result.peek() < stack.peek())) {
                buffer.push(result.pop());
            }
            buffer.push(stack.pop());
            while (!result.isEmpty()) {
                buffer.push(result.pop());
            }
            while (!buffer.isEmpty()) {
                result.push(buffer.pop());
            }
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
    }

    //smallest items are on the top
    // O(N^2)
    static Stack sortStack(Stack stack) {
        Stack result = new Stack();
        Stack buffer = new Stack();
        try {
            if (stack.isEmpty())
                return stack;
            result.push(stack.pop());
            while (!stack.isEmpty()) {
                if (!buffer.isEmpty() && buffer.peek() > stack.peek()) {
                    result.push(stack.pop());
                } else {
                    insertItem(stack, buffer, result);
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
        return result.isEmpty() ? buffer : result;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(4);
        stack.push(1);
        stack.push(6);
        stack.push(5);
        stack = sortStack(stack);
        try {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        }
    }
}
