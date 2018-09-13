import java.util.Arrays;

public class BinaryMinHeap {

    private int[] data;
    private int size;

    BinaryMinHeap(int capacity) {
        size = 0;
        data = new int[capacity + 1];
        Arrays.fill(data, - 1);
    }

    void insert(int value) throws Exception{
        if (size == data.length) {
            throw new Exception("Heap is full, can't insert one more element");
        }
        data[size++] = value;
        bubbleUp(size - 1);
    }

    private void bubbleUp(int size) {
        int temp = data[size];
        while (size > 0 && data[(size - 1) / 2] > temp) {
            data[size] = data[(size - 1) / 2];
            size = (size - 1) / 2;
        }
        data[size] = temp;
    }

    void printHeap() {
        System.out.print("Heap = ");
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
    }

    int extractMin() throws Exception {
        if (size == 0) {
            throw new Exception("Heap is empty");
        }
        int min = data[0];
        data[0] = data[size - 1];
        size--;
        bubbleDown();
        return min;
    }

    void bubbleDown () {
        int ind = 0;
        int smallestInd = data[2 * ind + 1] > data[2 * ind + 2] ?
                2 * ind + 2 : 2 * ind + 1;
        while (ind < size && data[smallestInd] < data[ind]) {
            swap(ind, smallestInd);
            ind = smallestInd;
        }
    }

    void swap(int ind1, int ind2) {
        int temp = data[ind1];
        data[ind1] = data[ind2];
        data[ind2] = temp;
    }
}
