public class CheckMyQueue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        System.out.println(queue.isEmpty());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.push(4);
        System.out.println(queue.peek());
    }
}
