import java.util.Scanner;

// O(N) time
// TODO boring solution - try recursion or use two pointers
public class ReturnKthToLast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int size = in.nextInt();
        Node list = new Node(size);
        for (int i = 0; i < size; i++) {
            list.appendToTail(in.nextInt());
        }
        System.out.println(list.returnKthToLast(k));
    }
}
