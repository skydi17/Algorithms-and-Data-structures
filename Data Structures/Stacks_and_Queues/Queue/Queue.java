public class Queue {
    private QueueNode first;
    private QueueNode last;

    static class QueueNode {
        private int data;
        private QueueNode next;

        QueueNode(int data) {
            this.data = data;
        }
    }

    // Add an item to the end of the list
    void add(int item) {
        QueueNode node = new QueueNode(item);
        if (last != null) {
            last.next = node;
        }
        last = node;
        if (first == null) {
            first = last;
        }
    }

    // Remove the first item in the list
    int remove() throws Exception {
        if (first == null) throw new Exception();
        int data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    // Return the top of the queue
    int peek() throws Exception {
        if (first == null) throw new Exception();
        return (last == null) ? first.data : last.data;
    }

    // Return true if and only if the queue is empty
    boolean isEmpty() {
        return first == null;
    }
}
