public class LinkedList {

    private LinkedListElement startPointer;

    LinkedList() {
        startPointer = null;
    }

    static class LinkedListElement {
        private Integer value;
        private LinkedListElement next;
        LinkedListElement(Integer value) {
            this.value = value;
            this.next = null;
        }
    }

    public void add(Integer value) {
        LinkedListElement element = new LinkedListElement(value);
        element.next = startPointer;
        startPointer = element;
    }

    public void delete(LinkedListElement pointer) {
        LinkedListElement iterator = startPointer;

        if (pointer == startPointer)
        {
            startPointer = startPointer.next;
            return;
        }

        while(iterator.next != pointer)
            iterator = iterator.next;
        iterator.next = pointer.next;

    }

    public LinkedListElement search(Integer value) {
        LinkedListElement iterator = startPointer;
        while (iterator != null) {
            if (value.equals(iterator.value)) {
                return iterator;
            }
            iterator = iterator.next;
        }
        return null;
    }

}
