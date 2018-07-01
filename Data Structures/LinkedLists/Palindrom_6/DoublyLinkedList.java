public class DoublyLinkedList {
    char data;
    DoublyLinkedList next;
    DoublyLinkedList previous;
    DoublyLinkedList lastElement;

    DoublyLinkedList(char data) {
        this.data = data;
    }

    void appendToTail(char data) {
        DoublyLinkedList node = new DoublyLinkedList(data);
        DoublyLinkedList n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
        node.previous = n;
        lastElement = node;
    }


    boolean isPalindrom() {
        DoublyLinkedList end = this;
        while (end.next != null) {
            end = end.next;
        }
        DoublyLinkedList start = this;
        start = start.next;
        while (start != end && start.next != end) {
             if (start.data != end.data) {
                 return Boolean.FALSE;
             }
             start = start.next;
             end = end.previous;
        }
        return Boolean.TRUE;
    }
}
