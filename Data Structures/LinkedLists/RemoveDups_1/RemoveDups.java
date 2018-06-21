import java.util.Scanner;

// O(N) time
public class RemoveDups {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        LinkedListNode list = new LinkedListNode(size);
        for (int i = 0; i < size; i++) {
            list.appendToTail(in.nextInt());
        }
        list.removeDups(size, list);
        list.readAll();
    }
}
