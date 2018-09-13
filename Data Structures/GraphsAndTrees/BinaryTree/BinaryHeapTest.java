public class BinaryHeapTest {
    public static void main(String[] args) {
        BinaryMinHeap heap = new BinaryMinHeap(10);
        try {
            heap.insert(1);
            heap.insert(50);
            heap.insert(23);
            heap.insert(88);
            heap.insert(90);
            heap.insert(32);
            heap.insert(74);
            heap.printHeap();
            heap.extractMin();
            heap.printHeap();
        } catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
    }
}
