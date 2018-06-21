import java.util.HashSet;
import java.util.Set;

public class LinkedListNode {
    private int data;
    private LinkedListNode next = null;

    LinkedListNode(int data) {
        this.data = data;
    }

    void appendToTail(int d) {
        LinkedListNode node = new LinkedListNode(d);
        LinkedListNode n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = node;
    }

    void readAll() {
        LinkedListNode i = next;
        while (i != null) {
            System.out.print(i.data + " ");
            i = i.next;
        }
    }

    LinkedListNode removeDups(int size, LinkedListNode list) {
        Set set = new HashSet<>(size);
        LinkedListNode i = null;
        while (list != null) {
            if (set.contains(list.data)) {
                i.next = list.next;
            } else {
                set.add(list.data);
                i = list;
            }
            list = list.next;
        }
        return list;
    }
}
