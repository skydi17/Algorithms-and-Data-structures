public class Stack {

    private static class StackNode {
        private int data;
        private StackNode next;

        StackNode(int data){
            this.data = data;
        }
    }

    StackNode top;

    // Remove the top item from the stack
    int pop() throws Exception {
        if (top == null) throw new Exception();
        int data = top.data;
        if (top == null) {
            return data;
        }
        top = top.next;
        return data;
    }

    // Add an item to the top of the stack
    void push(int data) {
        StackNode el = new StackNode(data);
        el.next = top;
        top = el;
    }

    // Return the top of the stack
    int peek () throws Exception {
        if (top == null) throw new Exception();
        return top.data;
    }

    // Return true if and only if the stack is empty
    boolean isEmpty() {
        return top == null;
    }
}
