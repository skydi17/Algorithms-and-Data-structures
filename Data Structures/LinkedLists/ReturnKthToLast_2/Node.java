public class Node {
    private int data;
    private Node next = null;

    Node(int data) {
        this.data = data;
    }

    void appendToTail(int data) {
        Node node = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    int countLength() {
        Node node = next;
        int length = 1;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    int findByPosition(int k) {
        Node node = next;
        int count = 0;
        while (node.next != null) {
            if (count == k) {
                return node.data;
            }
            node = node.next;
            count++;
        }
        return -1;
    }

    int returnKthToLast(int k) {
        int length = countLength();
        return findByPosition(length - k);
    }
}
